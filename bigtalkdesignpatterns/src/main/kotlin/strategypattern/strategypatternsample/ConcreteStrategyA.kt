package strategypattern.strategypatternsample

/**
 * @create on 2020/5/20 08:19
 * @description 具体算法A
 * @author mrdonkey
 */
class ConcreteStrategyA : Strategy() {
    /**
     * 算法A的实现方法
     */
    override fun algorithmInterface() {
        println("算法A的具体实现")
    }
}