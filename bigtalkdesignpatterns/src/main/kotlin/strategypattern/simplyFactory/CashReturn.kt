package strategypattern.simplyFactory

/**
 * @create on 2020/5/19 23:19
 * @description 返利收费子类
 * @author mrdonkey
 */
class CashReturn(var moneyCondition: Double = 0.0, var moneyReturn: Double = 0.0) : CashSuper() {
    /**
     * 例如 满300返100
     * [moneyCondition] 返利条件  300
     * [moneyReturn] 返利 100
     */
    override fun acceptCash(money: Double): Double {
        return if (money >= moneyCondition)
            money.minus(money.div(moneyCondition).toInt().times(moneyReturn))// 500-(500/300)*100
        else money
    }
}