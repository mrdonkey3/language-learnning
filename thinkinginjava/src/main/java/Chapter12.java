/**
 * <p>文件描述： Exception<p>
 * <p>作者：Mr-Donkey<p>
 * <p>创建时间：2019/12/9 23:31<p>
 * <p>更改时间：2019/12/9 23:31<p>
 * <p>版本号：1<p>
 */
public class Chapter12 {

    //page275
    //证明子类构造器不能捕捉基类构造的异常
    class ex21 {
        class BaseException extends Exception {
        }

        class Base {
            public Base() throws BaseException {
            }
        }

        class subClass extends Base {
            public subClass() throws BaseException {
                super();
                // not this way, 'catch' without 'try' not allowed:
                // catch(BaseException e) {}
                // not this way either, because call to super
                // must be first statement in constructor:
                // try {
                //	super();
                // } catch(BaseException e) {}
            }
        }
    }

    public static void main(String[] args) {
        try {
            try {
                throw new IndexOutOfBoundsException();
            } finally {
                throw new NullPointerException();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        //ex21
        try{
            Chapter12 chapter12 = new Chapter12();
            ex21.subClass subClass = chapter12.new ex21().new subClass();
        }catch (Exception e){
            PrintlnKt.println("BaseException caught in main");
        }
    }
}
