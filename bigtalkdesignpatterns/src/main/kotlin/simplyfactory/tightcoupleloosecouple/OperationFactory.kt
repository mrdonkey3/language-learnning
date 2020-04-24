package simplyfactory.tightcoupleloosecouple

/**
 * @create on 2020/4/23 23:33
 * @description 操作的工厂，让它知道该实例化哪个操作
 * @author mrdonkey
 */
class OperationFactory {
    companion object {
        @JvmStatic
        fun creatOperate(operate: String): Operation? = when (operate) {
            "+" -> {
                OperationPlus()
            }
            "-" -> {
                OperationMinus()
            }
            "*" -> {
                OperationTimes()
            }
            "/" -> {
                OperationDiv()
            }
            else -> {
                null
            }
        }
    }
}