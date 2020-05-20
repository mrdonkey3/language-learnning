package strategypattern.simplyFactory

import java.util.*

/**
 * @create on 2020/5/19 23:46
 * @description 客户端代码
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            val scanner = Scanner(System.`in`)
            println("请输入商品单价：")
            val price = scanner.nextLine().toDouble()
            println("请输入商品数量：")
            val num = scanner.nextLine().toInt()
            println("请选择计算方式：")
            println("0.原价")
            println("1.满300返100")
            println("2.打8折")
            val ordinal = scanner.nextLine().toInt()
            val cashSuper = CashFactory.createCashAccept(CashAcceptType.getTypeByOrdinal(ordinal))
            val total = cashSuper.acceptCash(price.times(num))
            println("总价：$total")
        }
    }
}