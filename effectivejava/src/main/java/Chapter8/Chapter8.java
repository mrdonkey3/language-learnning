package Chapter8;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author mrdonkey
 * @create on 2020/7/27 08:45
 * @description 方法
 */
public class Chapter8 {
    public static void main(String[] args) {
        //随机撒点法算法圆周率
//        Random random = new Random();
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int inner = 0;
        for (int i = 0; i < 100000000; i++) {
            float x = random.nextFloat();
            float y = random.nextFloat();
            if ((Math.pow(x, 2) + Math.pow(y, 2) + 0.25) < (x + y)) {
                inner++;
            }
        }
        Float pi = (inner / 100000000f) / 0.25f;
        System.out.println("pi:" + pi);
    }
}
