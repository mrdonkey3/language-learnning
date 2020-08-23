package chapter4;

import java.io.ObjectStreamClass;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;

/**
 * @author mrdonkey
 * @create on 2020/7/6 08:44
 * @description 类与接口
 */
public class Chapter4 {

    class Nineteen implements Serializable {//要么设计继承并提供稳定说明，要么禁止继承

        public void test() {
//            ObjectStreamClass //序列化的描述符类。 它包含名称和类的serialVersionUID。
            // 所述的ObjectStreamClass对该Java虚拟机装载一个特定的类，可以发现/使用查找方法创建的。
            ArrayList<String> list = new ArrayList<String>();
//            list.clear();
            //AbstractList#removeRange   ListIterator的使用
        }
    }

    class twenty {//接口优于抽象类

        public void test() {
//            Map.Entry
            //AbstractMap.SimpleEntry
        }
    }

    class twentyOne {//为后代设计接口

        private void test() {

        }
    }
}
