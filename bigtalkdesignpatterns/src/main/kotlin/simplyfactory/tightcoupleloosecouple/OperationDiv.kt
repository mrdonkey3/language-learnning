package simplyfactory.tightcoupleloosecouple

/**
 * @create on 2020/4/23 23:30
 * @description 除法
 * @author mrdonkey
 */
class OperationDiv : Operation() {
    override fun getResult(numberA: Double, numberB: Double) = numberA.div(numberB)
}