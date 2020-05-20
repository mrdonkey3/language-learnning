package strategypattern.strategypatternsample

/**
 * @create on 2020/5/20 08:21
 * @description 具体算法C
 * @author mrdonkey
 */
class ConcreteStrategyC : Strategy() {
    /**
     * 算法C的实现方法
     */
    override fun algorithmInterface() {
        println("算法C的具体实现")
    }
}