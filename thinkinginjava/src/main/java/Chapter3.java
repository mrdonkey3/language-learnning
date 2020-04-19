import java.util.Random;

/**
 * <p>文件描述：Operators 操作符<p>
 * <p>作者：Mr-Donkey<p>
 * <p>创建时间：2019-11-19 14:10<p>
 * <p>更改时间：2019-11-19 14:10<p>
 * <p>版本号：1<p>
 */
public class Chapter3 {


}

//3_2
class Tube {
    float f;

    public static void main(String[] args) {
        Tube t1 = new Tube();
        Tube t2 = new Tube();
        t1.f = 0.1f;
        t2.f = 0.2f;
        System.out.println("1 t1.f:" + t1.f + " , t2.f:" + t2.f);
        t1.f = t2.f;
        System.out.println("2 t1.f:" + t1.f + " , t2.f:" + t2.f);
        t1 = t2;
        t1.f = 0.3f;
        System.out.println("3 t1.f:" + t1.f + " , t2.f:" + t2.f);


    }

}

//3_4
class VelocityCalculator {
    static float velocity(float distance, float time) {
        return time == 0 ? 0 : Math.round(distance / time);
    }

    public static void main(String[] args) {
        System.out.println(velocity(100.4f, 20));
    }
}

//3_7
class CoinToss {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt();
        System.out.println(i % 2 == 0 ? "is heads" : "tails");
    }
}

//3_11
class RightShiftTest {
    public static void main(String[] args) {
        int a = 0x10000000;
        for (int i = 0; i < 28; i++) {
            //无符号右移，无论正负都在高位插入0
            a >>>= 1;
            System.out.println(Integer.toBinaryString(a));
        }
    }
}

//3_13
class CharBinaryTest {
    public static void main(String[] args) {
        char c = 'a';
        System.out.println(Integer.toBinaryString(c));
        c = 'b';
        System.out.println(Integer.toBinaryString(c));
        c = 'c';
        System.out.println(Integer.toBinaryString(c));
        c += 1;
        System.out.println(Integer.toBinaryString(c));
        c = 'A';
        System.out.println(Integer.toBinaryString(c));
    }
}
//3_14
class StringCompare{
    static void f(boolean b) {if(b == true) System.out.println(true);
    else System.out.println(false);}
    static void stringTest(String s, String t) {
        f(s == t);
        f(s.equals(t));
        f(t.equals(s));
        f(s != t);
        // f(!s);
        //f(!t);
        // s = s && t;
        // s = s || t;
        // s = ~t;
        // s = s  & t;
        // s = s | t;
        // s = s ^ t;
        // s &= t;
        // s ^= t;
        // s |= t;
    }
    public static void main(String[] args) {
        String s = "one", t = "two";
        StringCompare.stringTest(s, t);
    }
}
