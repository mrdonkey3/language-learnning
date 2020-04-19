import org.jetbrains.annotations.TestOnly;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Pattern;

/**
 * <p>文件描述：Type Info<p>
 * <p>作者：Mr-Donkey<p>
 * <p>创建时间：2020/3/21 13:37<p>
 * <p>更改时间：2020/3/21 13:37<p>
 * <p>版本号：1<p>
 */
public class Chapter14 {

    private static Pattern pattern = Pattern.compile("\\w+\\.");


    public static void main(String[] args) {
        if (args != null && args.length > 0) {
            try {
                Class<?> c = Class.forName(args[0]);
                Method[] methods = c.getMethods();
                if (args.length == 1) {
                    for (Method method : methods) {
                        System.out.println(pattern.matcher(method.toString()).replaceAll(""));
                    }
                }
               new ArrayList<String>().addAll()
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
