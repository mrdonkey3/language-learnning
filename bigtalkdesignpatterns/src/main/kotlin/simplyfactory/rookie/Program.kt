package simplyfactory.rookie

import java.util.*

/**
 * @create on 2020/4/23 22:50
 * @description 计算器控制台程序(两个数的运算)
 * @author mrdonkey
 */
class Program {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            val sc = Scanner(System.`in`)
            println("请输入数字A")
            val strNumberA = sc.nextLine()
            println("请输入运算符")
            val operate = sc.nextLine()
            println("请输入数字B")
            val strNumberB = sc.nextLine()
            val strResult: String = when (operate) {
                "+" -> {
                    strNumberA.toDouble().plus(strNumberB.toDouble()).toString()
                }
                "-" -> {
                    strNumberA.toDouble().minus(strNumberB.toDouble()).toString()
                }
                "*" -> {
                    strNumberA.toDouble().times(strNumberB.toDouble()).toString()
                }
                "/" -> {
                    if (strNumberB != "0")
                        strNumberA.toDouble().div(strNumberB.toDouble()).toString()
                    else
                        "除数不能为0"
                }
                else -> {
                    "不支持该运算"
                }
            }
            println("结果是：$strResult")
        }
    }
}