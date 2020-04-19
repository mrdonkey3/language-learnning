import java.util.Random;

/**
 * <p>文件描述：Controlling Execution<p>
 * <p>作者：Mr-Donkey<p>
 * <p>创建时间：2019/11/19 18:13<p>
 * <p>更改时间：2019/11/19 18:13<p>
 * <p>版本号：1<p>
 */
public class Chapter4 {

}

//4_2
class CompareInts {

    public static void main(String[] args) {
        Random random1 = new Random();
        Random random2 = new Random();
        for (int i = 0; i < 25; i++) {
            int x = random1.nextInt();
            int y = random2.nextInt();
            if (x == y) {
                PrintlnKt.println("i--->" + i + "   x==y");
            } else if (x > y) {
                PrintlnKt.println("i--->" + i + "   x>y");
            } else {
                PrintlnKt.println("i--->" + i + "   x<y");
            }
        }

        Random random3 = new Random();
        Random random4 = new Random();
        do {
            //for (int i = 0; i < 25; i++) {
            int x = random3.nextInt(10);
            int y = random4.nextInt(10);
            if (x == y) {
                PrintlnKt.println("i---> " + "  x==y");
            } else if (x > y) {
                PrintlnKt.println("i---> " + " x>y");
            } else {
                PrintlnKt.println("i---> " + " x<y");
            }
        } while (true);
    }
}

//4_4 偶数不可能为素数
class Primes {
    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            int factors = 0;
            for (int j = 1; j < (i + 2) / 2; j++) {
                if ((i % j) == 0) factors++;
            }
            if (factors < 2)
                PrintlnKt.println("i=" + i + ",is prime");
        }
    }
}

//4_5
class BinaryTest {


    public static void main(String[] args) {

        short k = 1 + 4 + 16 + 64; //2^6+2^4+2^2+2^0  1010101  85  int 是32位
        int m = 1 + 4 + 16 + 64; //2^6+2^4+2^2+2^0  1010101  85  int 是32位
        int j = 2 + 8 + 32 + 128;//2^7+2^5+2^3+2^2  10101010
//        int i=128;
        //拿到距离当前位前面0的个数 1010101 一共7位 前面的0数是32-7=25个
//        PrintlnKt.println(Integer.numberOfLeadingZeros(i));
        PrintlnKt.println(k);
        PrintlnKt.println(Integer.toBinaryString(k));
        int zeros = Integer.numberOfLeadingZeros(k);
        k <<= 8;
        PrintlnKt.println("-----zeros-----");
        PrintlnKt.println(zeros);
        PrintlnKt.println("-----toBinaryString-----");
        PrintlnKt.println(Integer.toBinaryString(k));
        PrintlnKt.println("-----toBinaryMethod-----");
        toBinaryMethod(k);
        PrintlnKt.println("");
        PrintlnKt.println("-----Controlling Execution-----");
        PrintlnKt.println(Integer.toBinaryString(m));
        PrintlnKt.println(Integer.toBinaryString(j));
        PrintlnKt.println(Integer.toBinaryString(m | j)); //01010101
        PrintlnKt.println(Integer.toBinaryString(m ^ j)); //10101010
        PrintlnKt.println(Integer.toBinaryString(m & j));
        PrintlnKt.println(Integer.toBinaryString(~m));
        PrintlnKt.println(Integer.toBinaryString(~j));
    }

    public static void toBinaryMethod(int i) {
        if (i == 0) PrintlnKt.print(0);
        else {
            //获取位首为0的个数 32-7=25
            int j = Integer.numberOfLeadingZeros(i);
            //左移25位
            i <<= j;
            //左移是未到达最高位时 低位补0，达到最高位时，则向高位截取 左移数可以拆成每次左移1来计算
            // i=10001000000000000000000000000000 i<<=1    numberOfLeadingZeros=0  1
            // i=10000000000000000000000000000     i<<=1   numberOfLeadingZeros=3  0
            // i=100000000000000000000000000000    i<<=1   numberOfLeadingZeros=2  0
            // i=1000000000000000000000000000000   i<<=1   numberOfLeadingZeros=1  0
            // i=10000000000000000000000000000000  i<<=1   numberOfLeadingZeros=0  1
            // i=0
            for (int k = 0; k < 32 - j; k++) {
                int p = Integer.numberOfLeadingZeros(i) == 0 ? 1 : 0;
                PrintlnKt.print(p);
                i <<= 1;
            }

        }
    }
}

//4_8
class SwitchForTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            PrintlnKt.println("----while loop starting---");
            switch (i) {
                case 5:
                    break;
            }
        }
        PrintlnKt.println("----while loop end ---");
    }
}

//4_9
class Fibonacci {
    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();
        int num = 8;
        for (int i = 0; i < num; i++) {
            int f = fibonacci.f(i);
            PrintlnKt.print(f);
            if (f == num) break;
        }
    }

    private int f(int n) {
        if (n < 2) return 1;
        return (f(n - 2) + f(n - 1));
    }
}

//4_10
class VampireNumber {
    //4位数的求最高位
    static int a(int i) {
        return i / 1000;
    }

    //第二位
    static int b(int i) {
        return (i % 1000) / 100;
    }

    //第三位
    static int c(int i) {
        return ((i % 1000) % 100) / 10;
    }

    //最后一位
    static int d(int i) {
        return ((i % 1000) % 100 % 10);
    }

    static int com(int a, int b) {
        return a * 10 + b;
    }

    static void test(int i, int c1, int c2) {
        if (i == c1 * c2) PrintlnKt.println(i + " is vampireNumber = " + c1 + "*" + c2);
    }

    public static void main(String[] args) {
        for (int i = 1001; i < 9999; i++) {
            test(i, com(a(i), b(i)), com(c(i), d(i)));
            test(i, com(a(i), b(i)), com(d(i), c(i)));
            test(i, com(a(i), c(i)), com(b(i), d(i)));
            test(i, com(a(i), c(i)), com(d(i), b(i)));
            test(i, com(a(i), d(i)), com(b(i), c(i)));
            test(i, com(a(i), d(i)), com(c(i), b(i)));

            test(i, com(b(i), a(i)), com(c(i), d(i)));
            test(i, com(b(i), a(i)), com(d(i), c(i)));
            test(i, com(b(i), c(i)), com(a(i), d(i)));
            test(i, com(b(i), c(i)), com(d(i), a(i)));
            test(i, com(b(i), d(i)), com(a(i), c(i)));
            test(i, com(b(i), d(i)), com(c(i), a(i)));

            test(i, com(c(i), a(i)), com(d(i), b(i)));
            test(i, com(c(i), b(i)), com(d(i), a(i)));

        }
    }
}
