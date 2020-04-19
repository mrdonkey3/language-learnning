import java.util.*
import kotlin.collections.ArrayList

/**
 * <p>文件描述：<p>
 * <p>作者：Mr-Donkey<p>
 * <p>创建时间：2019/12/18 22:58<p>
 * <p>更改时间：2019/12/18 22:58<p>
 * <p>版本号：1<p>
 *
 */
class Model {
    var data = arrayListOf("1", "2")
    private var isfirst = true

    fun doLogic() {
        if (isfirst) {
            isfirst = false
            Thread {
                val timer = Timer()
                timer.schedule(object : TimerTask() {
                    override fun run() {
                        synchronized(data) {
                            "--------------".println()
                            data.toString().println()
                            "--------------".println()
                        }
                    }
                }, 1000, 2000)
            }.start()
        }
    }



}