package chapter2;

import org.jetbrains.annotations.NotNull;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.*;
import java.util.function.Function;

/**
 * @author mrdonkey
 * @create on 2020/6/18 15:43
 * @description 对于所有对象都通用的方法
 */
public class Chapter3 {

    static class Ten implements Cloneable {
        private int i = 0;

        private void test() {
            //Timestamp->Date
//            Objects.equals(1,1)
        }

//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (!(o instanceof Ten)) return false;
//            Ten ten = (Ten) o;
//            return i == ten.i;
//        }
//
//        @Override
//        public int hashCode() {
//
//            return Objects.hash(i);
//        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            return super.clone();
        }
    }

    //12. 覆盖equals时总要覆盖hashCode
    static class Elven implements Cloneable { //如果需要被克隆成新的对象，避免重写equals方法
        private int code;
        //        private final Ten ten = new Ten(); 为了使类能被克隆成功，需要去掉域的final
        private Ten ten = new Ten();

//        private Ten ten;
//
//        @Override
//        public boolean equals(Object o) {
//            if (this == o) return true;
//            if (!(o instanceof Elven)) return false;
//            Elven elven = (Elven) o;
//            return code == elven.code &&
//                    ten.equals(elven.ten);
//        }
//
//        @Override
//        public int hashCode() {
//            return Objects.hash(code, ten);
//        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Elven elven = (Elven) super.clone();
//            elven.ten= (Ten) ten.clone(); final域无法改变引用
            elven.ten = (Ten) ten.clone();
            return elven;
//            return super.clone();
        }

        @Override
        public String toString() {
            return "Elven{" +
                    "code=" + code +
                    ", ten=" + ten +
                    '}';
        }
    }

    //13. 谨慎覆盖clone方法
    static class Thirteen implements Cloneable {
        public Elven elven;
//        Hashtable
//        HashMap

        public Thirteen(Elven elven) {
            this.elven = elven;
        }

        @Override
        protected Object clone() throws CloneNotSupportedException {
            Thirteen thirteen = (Thirteen) super.clone();
            thirteen.elven = (Elven) elven.clone();
            return thirteen;
//            return super.clone(); 直接这样调用，域若是引用类型，那么域就的引用就不变
        }

        @Override
        public String toString() {
            return "Thirteen{" +
                    "elven=" + elven +
                    '}';
        }
    }

    //14. 考虑实现Comparable接口
    static class Fourteen implements Comparable<Fourteen> {
        private int code;
        private String name;
        private Thirteen thirteen;

        @Override
        public int compareTo(@NotNull Fourteen o) {
            int result = Integer.compare(code, o.code);
            if (result == 0) {
                result = String.CASE_INSENSITIVE_ORDER.compare(name, o.name);
            }
//            String.CASE_INSENSITIVE_ORDER.compare()//String类定义的比较器

            Comparator a= (Comparator<Fourteen> & Serializable)COMPARATOR; //Comparator<Fourteen> & Serializable个表示强转成Comparator<T>和Serializable

//            Comparator.comparing()//引用对象类型的比较

            return result;
        }

        private static final Comparator COMPARATOR=Comparator
                .comparingInt((Fourteen f)-> f.code)
                .thenComparing(f->f.name);

        public int compareTo2(Fourteen fourteen){
            return COMPARATOR.compare(this,fourteen);
        }
    }

    public static void main(String[] args) {
        try {
            Thirteen thirteen = new Thirteen(new Elven());
            System.out.println("clone before:" + thirteen);
            System.out.println("clone after:" + thirteen.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
