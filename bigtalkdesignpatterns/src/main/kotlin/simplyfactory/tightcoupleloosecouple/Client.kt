package simplyfactory.tightcoupleloosecouple

import simplyfactory.packageprogram.Operate
import java.lang.Exception
import java.util.*

/**
 * @create on 2020/4/23 23:37
 * @description 客户端测试
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            try {
                val sc = Scanner(System.`in`)
                println("请输入数字A")
                val numberA = sc.nextLine().toDouble()
                println("请选择运算符（+、-、*、/）：")
                val operate = sc.nextLine()
                println("请输入数字B")
                val numberB = sc.nextLine().toDouble()
                val operation = OperationFactory.creatOperate(operate)
                println("输出结果是：${operation?.getResult(numberA, numberB)}")
            } catch (e: Exception) {
                println("你输入有错：${e.message}")
            }
        }
    }
}