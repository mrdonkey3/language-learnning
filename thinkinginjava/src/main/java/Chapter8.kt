import java.util.*
import java.util.concurrent.TimeUnit
import java.util.concurrent.locks.ReentrantLock
import kotlin.collections.ArrayList

/**
 * <p>文件描述：多态：消除类型之间的耦合性 <p>
 * <p>作者：Mr-Donkey<p>
 * <p>创建时间：2019/12/1 22:55<p>
 * <p>更改时间：2019/12/1 22:55<p>
 * <p>版本号：1<p>
 *
 */
class Chapter8 {


}

//8_6
open class Shape {

    private val shapeStr = shapeStr()


    private fun shapeStr() = "shapeStr".println()
    override fun toString(): String {
        this.javaClass.name.toString()
        return super.toString()
    }

//    fun draw(list: List<Shape>) {
//
//    }

    companion object {
        @JvmField
        val staticField = "jvmField-Shape :".println()
    }
}

class Circle : Shape() {
    private val circleStr = circleStr()

    private fun circleStr() = "circleStr".println()

    companion object {
        @JvmField
        val staticField = "jvmField-Circle :".println()
    }

    override fun toString(): String {
        this.javaClass.name.println()
        return super.toString()
    }

}

class Test8 {


    companion object {

        private val obj: Object = Object()

        @JvmStatic
        fun main(vararg args: String) {
//            val shape = Circle()
//            shape.toString()(
//            var s: List<Shape> = arrayListOf(Circle())
//            s.get(0)
            t3.start()
            Thread.sleep(3000)
            t3.interrupt()

//            shape.draw(shapeList)
//            thread1.start()
//            Thread.sleep(2000)
//            thread2.start()

            val ints: Array<Int> = arrayOf(1, 2, 3)
            val any: Array<Any> = Array<Any>(3) { "" }
            copy(ints, any) // 错误：期望 (Array<Any>, Array<Any>)
        }

        fun copy(from: Array<out Any>, to: Array<Any>) {
//            assert(from.size==to.size){"failed"}
            for (i in from.indices)
                to[i] = from[i]
        }


        fun demo(t: Draw<Circle>) {
            val s: Draw<out Shape> = t
            s.draw()
            //t.draw()
        }


        val thread1 = Thread {
            Thread.currentThread().name + "thread1---run----".println()
            thread2.start()
            Thread.sleep(1000)
            synchronized(obj) {
                Thread.currentThread().name + "thread1---wait----".println()
                //获取目标对象的一个检视器
                obj.wait()
                Thread.currentThread().name + "thread1---stop wait----".println()
            }
        }

        val thread2 = Thread {

            Thread.currentThread().name + "thread2---run----".println()
            synchronized(obj) {
                Thread.currentThread().name + "thread2---notifyAll----".println()
                //获取目标对象的一个检视器
                obj.notifyAll()
                Thread.currentThread().name + "thread2---stop wait----".println()
            }
        }

        val t3=Thread{
            val lock=ReentrantLock()
            val newCondition = lock.newCondition();
            lock.lock()
            newCondition.await(1000,TimeUnit.MILLISECONDS)
        }

    }


    interface Draw<T> {
        fun draw(): T
        fun draw(draw: T)
    }


}