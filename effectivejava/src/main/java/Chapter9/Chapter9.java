package Chapter9;

import java.io.ObjectInputStream;
import java.io.StreamCorruptedException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author mrdonkey
 * @create on 2020/7/29 10:01
 * @description 通用编程
 */
public class Chapter9 {

    static class Sixty {
        public static void main(String[] args) {
            System.out.println(" 1.03 - 0.42 = " + (1.03 - 0.42));//0.6100000000000001
            System.out.println(" 1.00 - 9*0.10= " + (1.00 - 9 * 0.10));//0.09999999999999998

            //error
            double money = 1.00;
            int itemsBought = 0;
            for (double price = 0.10; price <= money; price += 0.10) {
                itemsBought++;
                money -= price;
            }
            System.out.println("itemsBought = " + itemsBought);//itemsBought = 3
            System.out.println("money = " + money);//money = 0.3999999999999999

            //right  result : 4/0.00
            final BigDecimal TEN_CENTS = new BigDecimal("0.10");
            BigDecimal bigDecimal = TEN_CENTS.setScale(0, RoundingMode.FLOOR);
            BigDecimal funds = new BigDecimal("1.00");
            int bought = 0;
            for (BigDecimal price = TEN_CENTS; funds.compareTo(price) >= 0; price = price.add(TEN_CENTS)) {
                bought++;
                funds = funds.subtract(price);
            }
            System.out.println("bought = " + bought);//bought = 4
            System.out.println("funds = " + funds);//funds = 0.00
            System.out.println("2.pow(64) = " + Math.pow(2, 32));//2.pow(64) = 4.294967296E9
            System.out.println("2.pow(64) = " + Math.pow(2, 64));//2.pow(64) = 1.8446744073709552E19
        }
    }

    static class SixtyOne {

        static Comparator<Integer> naturalOrder = (i, j) -> i < j ? -1 : (i == j ? 0 : 1);

        public static void main(String[] args) {
//            List<Integer> list = new ArrayList<>();
//            ThreadLocalRandom random = ThreadLocalRandom.current();
//            for (int i = 0; i < 10000; i++) {
//                int num = random.nextInt();
//                list.add(num);
//            }
//            list.sort(naturalOrder);
//            StreamCorruptedException
//            ObjectInputStream

            System.out.println(naturalOrder.compare(new Integer(41), new Integer(41)));//1
            Map<Integer, String> map = new HashMap<>();
            map.put(new Integer(1), "1");
            String s = map.get(new Integer(1));
            System.out.println("s = " + s);
            int hash = Objects.hash(new Integer(1));
            System.out.println("hash = " + hash);
            int hash2 = Objects.hash(new Integer(1));
            System.out.println("hash2 = " + hash2);
            boolean equals = Objects.equals(new Integer(1), new Integer(1));
            System.out.println("equals = " + equals);//true Integer重写了equals方法，比较的是值相等

        }
    }

}
