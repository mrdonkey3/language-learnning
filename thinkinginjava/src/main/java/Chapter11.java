import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * <p>文件描述：<p>
 * <p>作者：Mr-Donkey<p>
 * <p>创建时间：2019/12/8 23:31<p>
 * <p>更改时间：2019/12/8 23:31<p>
 * <p>版本号：1<p>
 */
public class Chapter11 {

    class ex implements Iterable<String> {

        @NotNull
        @Override
        public Iterator<String> iterator() {
            return null;
        }
    }

    class ex2 {

    }

    public static void main(String[] args) {
        Integer[] integers = {1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(integers);
        PrintlnKt.println(list.hashCode());
        List<Integer> list2 = new ArrayList<>(Arrays.asList(integers));
//        list2.remove(1);
        PrintlnKt.println(list2.hashCode());
        PrintlnKt.println(list2.toString());
        PrintlnKt.println(list.toString());
        PrintlnKt.println(list2);

    }
}
