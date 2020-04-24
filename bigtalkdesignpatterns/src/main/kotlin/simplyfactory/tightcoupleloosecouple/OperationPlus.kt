package simplyfactory.tightcoupleloosecouple

/**
 * @create on 2020/4/23 23:28
 * @description TODO
 * @author 加法
 */
class OperationPlus : Operation() {
    override fun getResult(numberA: Double, numberB: Double) = numberA.plus(numberB)
}