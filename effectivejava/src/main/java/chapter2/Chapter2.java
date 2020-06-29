package chapter2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * @author mrdonkey
 * @create on 2020/5/27 22:14
 * @description 创建对象和销毁对象
 */
public class Chapter2 {

    //第7条：消除过期的引用
   static class Seven {

        private void test() {
        }
    }

    //第8条：避免使用终结方法和清除方法
    static class Eight implements AutoCloseable {
        @Override
        public void close() throws Exception {

        }
    }

    //9，使用try-with-resources 优于 try-finally
    static class Night {
        private void test() {
            //BufferedReader 实现了AutoCloseable接口，当
            try (BufferedReader br = new BufferedReader(new FileReader("xxx"))) {
                br.readLine();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        Collections.rotate(arrayList, -1);
        System.out.println("1------>" + arrayList);
        Collections.rotate(arrayList, -1);
        System.out.println("2------>" + arrayList);
        Collections.rotate(arrayList, -1);
        System.out.println("3------>" + arrayList);
    }
}
