package strategypattern.simplyFactory

/**
 * @create on 2020/5/19 23:35
 * @description 现金收费工厂
 * @author mrdonkey
 */
class CashFactory {
    companion object {
        @JvmStatic
        fun createCashAccept(type: CashAcceptType): CashSuper {
            return when (type) {
                CashAcceptType.NORMAL -> CashNormal()
                CashAcceptType.RETURN300_100 -> CashReturn(type.arg[0], type.arg[1])
                CashAcceptType.REBATE -> CashRebate(type.arg[0])
            }
        }
    }
}