package strategypattern.v2

import java.util.*

/**
 * @create on 2020/5/19 22:24
 * @description 收银客户端：增加打折功能
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
            println("请选择计算方式：")
            println("1.原价")
            println("2.打8折")
            println("3.打7折")
            val rebate = when (scanner.nextLine().toInt()) {
                1 -> 1.0
                2 -> 0.8
                else -> 0.7
            }
            println("商品总价为：${price.times(num).times(rebate)}")
        }
    }
}