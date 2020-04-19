import java.util.Date;

/**
 * <p>文件描述：thinking in java chapter 2 EveryThing is an Object<p>
 * <p>作者：Mr-Donkey<p>
 * <p>创建时间：2019-11-18 19:00<p>
 * <p>更改时间：2019-11-18 19:00<p>
 * <p>版本号：1<p>
 * standard solution -->> http://greggordon.org/java/tij4/solutions.htm
 */
public class Chapter2 {


}

//2_1
class PrimitiveTest {
    static int i;
    static char c;

    public static void main(String[] args) {
        System.out.println("default filed value i:" + i + ",c:" + c);
    }

}

//2_2
class HelloDate {
    public static void main(String[] args) {
        System.out.println("Hello ,it's " + new Date());
    }
}


//2_3
class ATypeName {
    public static void main(String[] args) {
        ATypeName aTypeName = new ATypeName();
    }
}

//2_4 2_5
class DataOnly {
    int i;
    double d;
    double b;

    public static void main(String[] args) {
        DataOnly dataOnly = new DataOnly();
        dataOnly.i = 1;
        dataOnly.d = 1.0;
        dataOnly.b = 1.0;
        System.out.println("dataOnly.i:" + dataOnly.i + " , dataOnly.d:" + dataOnly.d + ", dataOnly.b:" + dataOnly.b);
    }
}

//2_8
class StaticTest {
    static int i = 1;

    public static void main(String[] args) {
        StaticTest one = new StaticTest();
        one.i = 2;
        StaticTest two = new StaticTest();
        StaticTest three = new StaticTest();
        System.out.println("one.i:" + one.i);
        System.out.println("two.i:" + two.i);
        System.out.println("three.i:" + three.i);


    }
}

//2_9
class autoBoxTest {

    public static void main(String[] args) {
        boolean b = false;
        byte t = 8;
        short s = 16;
        char c = 'x';
        int i = 32;
        float f = 0.32f;
        long l = 64;
        double d = 0.64;
        Boolean B = b;
        System.out.println("boolean b = " + b);
        System.out.println("Boolean B = " + B);
        Character C = c;
        System.out.println("char c = " + c);
        System.out.println("Character C = " + C);
        Byte T = t;
        System.out.println("byte t = " + t);
        System.out.println("Byte T = " + T);
        Short S = s;
        System.out.println("short s = " + s);
        System.out.println("Short S = " + S);
        Integer I = i;
        System.out.println("int i = " + i);
        System.out.println("Integer I = " + I);
        Long L = l;
        System.out.println("long l = " + l);
        System.out.println("Long L = " + L);
        Float F = f;
        System.out.println("float f = " + f);
        System.out.println("Float F = " + F);
        Double D = d;
        System.out.println("double d = " + d);
        System.out.println("Double D = " + D);
    }

}

class CommandArgsTest {
    public static void main(String[] args) {
        System.out.println("args[0]:"+args[0]);
        System.out.println("args[1]:"+args[1]);
        System.out.println("args[2]:"+args[2]);

    }
}






