/**
 * @create on 2020/7/10 10:05
 * @description TODO
 * @author mrdonkey
 */
class ThreadTest : Thread() {

    private var flag = true
    override fun run() {
        while (flag) {
            try {
                println("--->sleep")
                sleep(3000)
                //do something
                println("--->do something")
            } catch (e: InterruptedException) {
                println("--->InterruptedException")
                flag = false
                e.printStackTrace()
            }
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val thread = ThreadTest()
            thread.start()

            while (thread.flag) {
                Thread.sleep(1000)
                println("before--->interrupt:${thread.isInterrupted}")
                thread.interrupt()
                println("after--->interrupt:${thread.isInterrupted}")
            }
        }
    }
}