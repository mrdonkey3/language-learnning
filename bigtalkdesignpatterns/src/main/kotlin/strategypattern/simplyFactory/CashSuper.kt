package strategypattern.simplyFactory

/**
 * @create on 2020/5/19 23:11
 * @description 现金收费抽象类
 * @author mrdonkey
 */
abstract class CashSuper {
    /**
     * 收取现金抽象方法，返回为当前价
     */
    abstract fun acceptCash(money: Double): Double
}