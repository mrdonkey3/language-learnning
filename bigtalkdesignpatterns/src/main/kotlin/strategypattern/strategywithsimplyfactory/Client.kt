package strategypattern.strategywithsimplyfactory

import strategypattern.simplyFactory.CashAcceptType
import java.util.*

/**
 * @create on 2020/5/20 08:34
 * @description 客户端
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
            val cc = CashContext((CashAcceptType.getTypeByOrdinal(ordinal)))
            val total = cc.getResult(price.times(num))
            println("总价：$total")
        }
    }

}