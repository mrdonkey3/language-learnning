package chapter5;

import java.util.*;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 * @author mrdonkey
 * @create on 2020/7/9 12:51
 * @description 泛型
 */
public class Chapter5 {

    private void test() {
        new ThirtySeven();
    }

    static class ThirtyOne {
        ThirtyOne next;
        int count;

        @Override
        public String toString() {
            return "ThirtyOne{" +
                    "next=" + next +
                    '}';
        }

        public ThirtyOne getNext() {
            if (next == null) next = new ThirtyOne();
            return next;
        }

        public ThirtyOne getNullOrNext() {
            if (count == 0) {
                count++;
                return null;
            } else {
                return new ThirtyOne();
            }
        }

        private void test() {
            //ScheduledFuture
        }
    }

    class ThirtyThree {
        private void test() {
//            String.class.cast()

        }
    }

    class ThirtySeven {
        int key;
        int value;
        A a = A.A;

        private void test() {
            int[] a = {1, 2,};
            int[][] b = {{1}, {2}, {3}};
            EnumMap<A, Object> aObjectEnumMap = new EnumMap<>(A.class);
            ArrayList<ThirtySeven> arrayList = new ArrayList<>();
            EnumMap<A, Set<ThirtySeven>> collect = arrayList
                    .stream()
                    .collect(Collectors.groupingBy(p -> p.a,
                            () -> new EnumMap<>(A.class), Collectors.toSet()));
            System.out.println("--->" + collect);
        }

        @Override
        public String toString() {
            return "ThirtySeven{" +
                    "key=" + key +
                    ", value=" + value +
                    '}';
        }
    }

    enum A implements Interface {
        A, B, C;
    }


    interface Interface {

    }

    public Chapter5() {
    }

    public static <T extends Enum<T> & Interface> void test2(T t) {

    }

    public static void main(String... args) {
        test2(A.A);
//      ClassCastException: [Ljava.lang.Object; cannot be cast to [Ljava.lang.String
//        String[] strings = pickTwo("Good", "1", "2");//始终返回Object[]数组
//        System.out.println(strings);
        ThirtyOne s = new ThirtyOne();
        System.out.println("--->" + s.getNext().hashCode());//2018699554
        ThirtyOne m = s;
        System.out.println("--->" + s.hashCode());//1311053135
        s = m.next;
        System.out.println("--->" + m.hashCode());//1311053135
        m.next = null;
        System.out.println("--->" + s.hashCode());//2018699554 -> s->next
        System.out.println("--->" + m.hashCode());//1311053135 -> m->s

        ThirtyOne instance = m.getNullOrNext();//null
        System.out.println("--->1" + instance);//1311053135 -> m->s
        m.getNullOrNext();//null not
        System.out.println("--->2" + m.getNullOrNext());//1311053135 -> m->s
        System.out.println("--->3" + instance);//1311053135 -> m->s

        ThirtySeven thirtySeven = new Chapter5().new ThirtySeven();
        thirtySeven.test();

    }


    public static <T> T[] pickTwo(T a, T b, T c) {
        switch (ThreadLocalRandom.current().nextInt(3)) {
            case 0:
                return toArray(a, b);
            case 1:
                return toArray(b, c);
            case 2:
                return toArray(a, c);
        }
        throw new AssertionError();
    }

    public static <T> T[] toArray(T... args) {
        return args;
    }
}
