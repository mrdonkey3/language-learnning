package simplyfactory.packageprogram

import java.util.*

/**
 * @create on 2020/4/23 23:09
 * @description 利用封装来实现 将页面逻辑与业务逻辑分开
 * @author mrdonkey
 */
class PackageProgram {

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
                println("输出结果是：${Operate.getResult(numberA, numberB,operate)}")
            } catch (e: Exception) {
                println("你输入有错：${e.message}")
            }

        }
    }

}