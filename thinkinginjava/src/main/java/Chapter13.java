import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>文件描述：Strings<p>
 * <p>作者：Mr-Donkey<p>
 * <p>创建时间：2019/12/10 23:22<p>
 * <p>更改时间：2019/12/10 23:22<p>
 * <p>版本号：1<p>
 */
public class Chapter13 {


    class InfiniteRecursion {
        @Override
        public String toString() {
            return "InfiniteRecursion" + this + "/n";
//            return super.toString(); right invoke
        }

    }


    public static void main(String[] args) {
        List<InfiniteRecursion> infiniteRecursions = new ArrayList<InfiniteRecursion>();
        for (int i = 0; i < 10; i++) {
            infiniteRecursions.add(new Chapter13().new InfiniteRecursion());
        }
//        PrintlnKt.println(infiniteRecursions);
        //Sentence10
//        new Sentence10().test();
        new Sentence11().test();
    }

    static class Sentence10 {
        private void test() {
            String input = "Java now has regular expressions";
            String[] args = {"^Java", "\\Breg.*", "n.w\\s+h(a|i)s", "s?", "s*", "s+", "s{4}", "s{1}.", "s{0,3}"};
            for (String arg : args) {
                Pattern pattern = Pattern.compile(arg);
                Matcher matcher = pattern.matcher(input);
                PrintlnKt.println("Regular expressions----->" + arg);
                while (matcher.find()) {
                    System.out.println("Matcher \"" + matcher.group() + "\" at positions " +
                            matcher.start() + "-" + (matcher.end() - 1));
                }
            }
        }
    }

    static class Sentence11 {
        private void test() {
            String input = "Arline ate eight apples and one orange while Anita hadn't any";
            String patterns = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+[aeiou]\\b";
            Pattern pattern = Pattern.compile(patterns);
            Matcher matcher = pattern.matcher(input);
            PrintlnKt.println("Regular expressions----->" + input);
            while (matcher.find()) {
                System.out.println("Matcher \"" + matcher.group() + "\" at positions " +
                        matcher.start() + "-" + (matcher.end() - 1));
            }
        }
    }
}
