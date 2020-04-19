import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * <p>文件描述：inner Class<p>
 * <p>作者：Mr-Donkey<p>
 * <p>创建时间：2019/12/7 15:58<p>
 * <p>更改时间：2019/12/7 15:58<p>
 * <p>版本号：1<p>
 */
public class Chapter10 {

    interface Tree {
        class LemonTree implements Tree {
            static void f() {

            }
        }
    }

    interface Tree2 {

        void f();

        class LemonTree2 {
            static void f(Tree2 tree2) {
                PrintlnKt.println(tree2.hashCode());
            }
        }
    }

    //10_21

    class Test implements Tree {

    }

    static class Test2 implements Tree2 {

        @Override
        public void f() {
//            PrintlnKt.println("------Test2-----");
        }
    }

    private List<String> strs = new ArrayList<>();


    public static void main(String[] args) {

        PrintlnKt.println("------Test3-----" + 31.2164670000 * 1000000.0D);
        PrintlnKt.println("------Test4-----" + (31.2164670000 * 1000000.0D) / 1000000.0D);


        Tree.LemonTree lemonTree = new Test.LemonTree();
        Test2 t = new Test2();
        Tree2.LemonTree2.f(t);
//        t.hashCode()
//        new Random(1)
//        Map
    }
}
