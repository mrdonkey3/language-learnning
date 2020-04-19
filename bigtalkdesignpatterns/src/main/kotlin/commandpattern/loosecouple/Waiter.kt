package commandpattern.loosecouple

import java.text.SimpleDateFormat
import java.util.*


/**
 * @Create on 2020/4/18 16:24
 * @description 服务员
 * @author mrdonkey
 */
class Waiter {
    //可以接受多个命令
    private val orders = arrayListOf<Command>()

    /**
     * 设置订单 set the given[order]
     */
    fun setOrder(vararg orders: Command) {
        orders.forEach { cmd ->
            when (cmd) {
                is BakeChickenWingCommand -> {
                    println("服务员：鸡翅没有了，请点别的烧烤")
                }
                else -> {
                    this.orders.add(cmd)
                    println("增加订单：${cmd::class.java.simpleName} 时间：${currentTime()}")
                }
            }
        }

    }


    /**
     * 取消订单 cancel the given[order]
     */
    fun cancelOrder(order: Command): Boolean {
        orders.remove(order)
        println("取消订单：${order::class.java.simpleName} 时间：${currentTime()}")
        return false
    }

    /**
     * 执行通知操作
     */
    fun doNotify() {
        orders.forEach { cmd ->
            cmd.executeCommand()
        }
    }

    /**
     * 获取当前时间
     */
    private fun currentTime() = SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(Date())
}