package strategypattern.v1

import java.util.*

/**
 * @create on 2020/5/19 22:02
 * @description 收银客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(vararg arg: String) {
            val scanner = Scanner(System.`in`)
            println("请输入商品单价：")
            val price = scanner.nextLine().toDouble()
            println("请输入商品数量：")
            val num = scanner.nextLine().toInt()
            println("商品总价为：${price.times(num)}")
        }
    }
}