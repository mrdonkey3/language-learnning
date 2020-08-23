package chapter6;

import java.util.HashMap;
import java.util.function.BiFunction;

/**
 * @author mrdonkey
 * @create on 2020/7/15 17:36
 * @description TODO
 */
public class Chapter6 {

    class FortyFour {
        public void test() {
            HashMap<String, Integer> map = new HashMap<>();
            map.merge("1", 1, (s, s2) -> s + s2);
            map.merge("1", 1, Integer::sum);
        }

        void test(Integer str) {

        }
    }

    public static void main(String[] args) {
        new Chapter6().new A(1);
    }

    class A extends B {
        public A(int a) {
//            super();
            System.out.println("A");
        }
    }

    class B {
        public B() {
            System.out.println("B");
        }
    }
}
