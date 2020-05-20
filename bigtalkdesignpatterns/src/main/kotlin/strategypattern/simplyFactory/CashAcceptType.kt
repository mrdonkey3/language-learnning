package strategypattern.simplyFactory

/**
 * @create on 2020/5/19 23:38
 * @description 收费类型
 * @author mrdonkey
 */
enum class CashAcceptType(vararg var arg: Double) {
    NORMAL,//正常收费
    RETURN300_100(300.0, 100.0),//满300返利100
    REBATE(0.8);//打8折

    companion object{
        @JvmStatic
        fun getTypeByOrdinal(ordinal: Int): CashAcceptType = values()[ordinal]
    }
}