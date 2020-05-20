package strategypattern.simplyFactory

/**
 * @create on 2020/5/19 23:16
 * @description 打折收费子类
 * @author mrdonkey
 */
class CashRebate(var moneyRebate: Double = 1.0) : CashSuper() {

    /**
     * 打折收费
     */
    override fun acceptCash(money: Double): Double {
        //moneyRebate为构造参数参入折扣率，如果是8折则传入0.8，默认则1.0
        return money.times(moneyRebate)
    }

}