package simplyfactory.tightcoupleloosecouple

/**
 * @create on 2020/4/23 23:30
 * @description 乘法
 * @author mrdonkey
 */
class OperationTimes : Operation() {
    override fun getResult(numberA: Double, numberB: Double) = numberA.times(numberB)
}