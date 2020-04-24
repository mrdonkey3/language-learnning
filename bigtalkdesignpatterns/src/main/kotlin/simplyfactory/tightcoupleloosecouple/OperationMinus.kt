package simplyfactory.tightcoupleloosecouple

/**
 * @create on 2020/4/23 23:29
 * @description 减法
 * @author mrdonkey
 */
class OperationMinus : Operation() {
    override fun getResult(numberA: Double, numberB: Double) = numberA.minus(numberB)
}