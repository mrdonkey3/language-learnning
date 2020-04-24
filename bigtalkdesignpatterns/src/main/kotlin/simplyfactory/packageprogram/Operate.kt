package simplyfactory.packageprogram

/**
 * @create on 2020/4/23 23:11
 * @description 把操作类抽出来
 * @author mrdonkey
 */
class Operate {
    companion object {
        @JvmStatic
        fun getResult(numberA: Double, numberB: Double, operate: String): Double {
            return when (operate) {
                "+" -> {
                    numberA.plus(numberB)
                }
                "-" -> {
                    numberA.minus(numberB)
                }
                "*" -> {
                    numberA.times(numberB)
                }
                "/" -> {
                    numberA.div(numberB)
                }
                else -> {
                    0.toDouble()
                }
            }
        }
    }
}