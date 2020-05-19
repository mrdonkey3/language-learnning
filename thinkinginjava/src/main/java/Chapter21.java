import java.util.Random;
import java.util.concurrent.*;

/**
 * @author mrdonkey
 * @create on 2020/4/24 22:15
 * @description 21.5.1 pager705
 */
public class Chapter21 {

    public static void main(String[] args) {
        Obj obj = new Obj();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new Thread(() -> {
            synchronized (obj) {
                try {
                    System.out.println("----start waiting----");
                    obj.wait();
                    System.out.println("----stop waiting----");
                } catch (InterruptedException e) {
                }
            }
        }));
        executorService.execute(new Thread(() -> {
            synchronized (obj) {
                obj.notify();
                System.out.println("----notify----");
            }
        }));
    }

}

class Obj {

}


//21.7 pager 722 CountDownLatch

/**
 * 部分任务
 */
class TaskPortion implements Runnable {
    private static int counter = 0;
    private final int id = counter++;
    private static Random rand = new Random(47);
    private final CountDownLatch latch;

    public TaskPortion(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            doWork();
            latch.countDown();
            System.out.println(this + " latch count->" + latch.getCount());
        } catch (InterruptedException e) {
            //acceptable way to exit
        }
    }

    /**
     * 模拟真实的耗时操作
     *
     * @throws InterruptedException
     */
    private void doWork() throws InterruptedException {
        TimeUnit.MILLISECONDS.sleep(rand.nextInt(2000));
        System.out.println(this + " complete");
    }

    @Override
    public String toString() {
        return String.format("%1$-3d", id);//第一个参数向左对齐，保留3位数，不够补零（在对齐的方向补）
    }
}

/**
 * 等待任务
 */
class WaitingTask implements Runnable {

    private static int counter = 0;
    private final int id = counter++;
    private final CountDownLatch latch;

    public WaitingTask(CountDownLatch latch) {
        this.latch = latch;
    }

    @Override
    public void run() {
        try {
            latch.await();
            System.out.println("Launch barrier passed for " + this);
        } catch (InterruptedException e) {
            System.out.println(this + " interrupted");
        }
    }

    @Override
    public String toString() {
        return String.format("WaitingTask %1$-3d ", id);
    }
}

class CountDownLatchDemo {
    static final int SIZE = 100;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
        //All must share a single CountDownLatch object;
        CountDownLatch latch = new CountDownLatch(SIZE);
        for (int i = 0; i < 10; i++)
            exec.execute(new WaitingTask(latch));
        for (int i = 0; i < SIZE; i++)
            exec.execute(new TaskPortion(latch));
        TimeUnit.MILLISECONDS.sleep(5000);
        System.out.println("Launch all tasks ");
        exec.shutdownNow();//Quit when all tasks complete
    }
}