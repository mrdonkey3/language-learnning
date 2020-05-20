package strategypattern.strategywithsimplyfactory

import strategypattern.simplyFactory.*

/**
 * @create on 2020/5/20 08:32
 * @description 收费上下文
 * @author mrdonkey
 */
class CashContext constructor(type: CashAcceptType) {
    private var cs: CashSuper = when (type) {
        CashAcceptType.NORMAL -> CashNormal()
        CashAcceptType.RETURN300_100 -> CashReturn(type.arg[0], type.arg[1])
        CashAcceptType.REBATE -> CashRebate(type.arg[0])
    }


    /**
     * 根据策略不同，获得计算结果
     */
    fun getResult(money: Double): Double {
        return cs.acceptCash(money)
    }
}