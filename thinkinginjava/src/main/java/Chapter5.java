/**
 * <p>文件描述：Initialization And CleanUp<p>
 * <p>作者：Mr-Donkey<p>
 * <p>创建时间：2019/11/20 10:56<p>
 * <p>更改时间：2019/11/20 10:56<p>
 * <p>版本号：1<p>
 */
public class Chapter5 {
    public static void main(String[] args) {

    }
}
//5_11
class FinalizeTest {

    boolean loggedIn = false;

    public FinalizeTest(boolean logStatus) {
        this.loggedIn = logStatus;
    }

    private void logOut() {
        loggedIn = false;
    }

    private void logIn() {
        loggedIn = true;
    }

    //    @Override
    protected void finalize() {
//        if (loggedIn)
            PrintlnKt.println("coming in---->" + hashCode());
//        super.finalize();
    }

    public static void main(String[] args) {
        FinalizeTest test = new FinalizeTest(true);
        PrintlnKt.println("coming in----> test:" + test.hashCode());
        test.logOut();
        FinalizeTest test2 = new FinalizeTest(true);
        PrintlnKt.println("coming in----> test2:" + test2.hashCode());

//        System.gc();
        // Attempts to finalize any missed banks:
        System.out.println("Try 1: ");
        System.runFinalization();
        System.out.println("Try 2: ");
        Runtime.getRuntime().runFinalization();
        System.out.println("Try 3: ");
        System.gc();
        System.out.println("Try 4: ");
        // using deprecated since 1.1 method:
//        System.runFinalizersOnExit(true);
    }

}
