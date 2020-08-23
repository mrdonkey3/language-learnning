package chapter7;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

/**
 * @author mrdonkey
 * @create on 2020/7/21 08:39
 * @description Lambda和steam
 */
public class Chapter7 {

    class FortyFive {

        private void test() {
            int minGroupSize = 11;
            Map<String, Set<String>> groups = new HashMap<>();
            groups.computeIfAbsent("1", (unused) -> new TreeSet<>())
                    .add("value");
            try (Stream<String> words = Files.lines(Paths.get(""))) {
                words.collect(groupingBy(word -> word
                        .chars()
                        .sorted().
                                collect(StringBuilder::new,
                                        (sb, c) -> sb.append((char) c),
                                        StringBuilder::append).toString()))
                        .values()
                        .stream()
                        .filter(group -> group.size() >= minGroupSize)
                        .map(group -> group.size() + ":" + group)
                        .forEach(System.out::println);
            } catch (IOException e) {
                e.printStackTrace();
            }
            //.
            Stream.iterate(BigInteger.valueOf(2), BigInteger::nextProbablePrime)
                    .filter(mersenne -> mersenne.isProbablePrime(50))
                    .limit(10)
                    .map(p -> BigInteger.valueOf(2).pow(p.intValueExact()).subtract(BigInteger.ONE))
                    .forEach(mp -> System.out.println(mp.bitLength() + ":" + mp));
        }
    }


    class FortySix {
        private void test() {
            Map<String, Integer> map = new HashMap<>();
            Integer[] numbers = {1, 2, 3, 4, 5, 1, 2, 3};
            //foreach不应该执行计算
            Stream.of(numbers)
                    .forEach(number -> map.merge(number.toString(), 1, Integer::sum));
            //改成这样
            Stream.of(numbers).collect(groupingBy(Integer::intValue, counting()));

            map.keySet().stream()
                    //按map.get(key)得到value值的最大值来排序
                    .sorted(comparing(map::get).reversed())
                    .limit(10)
                    .collect(toList());
//                    .collect(toMap());


        }
    }

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        Integer[] numbers = {1, 2, 3, 4, 5, 1, 2, 3};
        //foreach不应该执行计算
//        Stream.of(numbers)
//                .forEach(number -> map.merge(number.toString(), 1, Integer::sum));
        //改成这样
//        Stream.of(numbers).collect(groupingBy(Integer::intValue)).values().forEach(System.out::println);


//        Stream.iterate(BigInteger.valueOf(2), BigInteger::nextProbablePrime)
//                .limit(10)
//                .forEach(System.out::print);
//        Stream.iterate(BigInteger.valueOf(2), BigInteger::nextProbablePrime)
//                .filter(mersenne -> mersenne.isProbablePrime(50))
//                .limit(10)
//                .map(p -> BigInteger.valueOf(2).pow(p.intValueExact()).subtract(BigInteger.ONE))
//                .forEach(mp -> System.out.println(mp.bitLength() + ":" + mp));


//        Stream.concat()
//        Arrays.asList(numbers).subList()
        List<List<Integer>> collect1 = Stream.of(Arrays.asList(numbers), Arrays.asList(numbers))
                .map(t -> t.subList(1, 5))
                .collect(toList());
        System.out.println(collect1);
        //[[2, 3, 4, 5], [2, 3, 4, 5]]

        List<Integer> collect = Stream.of(Arrays.asList(numbers), Arrays.asList(numbers))//平铺
                .flatMap(t -> t.subList(1, 5).stream()).collect(toList());
        System.out.println(collect);
        //[2, 3, 4, 5, 2, 3, 4, 5]

    }
}
