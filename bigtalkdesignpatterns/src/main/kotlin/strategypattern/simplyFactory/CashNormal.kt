package strategypattern.simplyFactory

/**
 * @create on 2020/5/19 23:14
 * @description 正常收费子类
 * @author mrdonkey
 */
class CashNormal : CashSuper() {
    /**
     * 正常收费返回原价
     */
    override fun acceptCash(money: Double): Double {
        return money
    }
}