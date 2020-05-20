package strategypattern.strategypatternsample

/**
 * @create on 2020/5/20 08:23
 * @description Context上下文，用一个ConcreteStrategy来配置，维护一个对Strategy对象的引用
 * @author mrdonkey
 */
class Context constructor(private val strategy: Strategy) {
    /**
     * [strategy] 算法的一部分是作为参数传递的
     * 根据具体的侧脸对象，调用其算法的方法
     */
    fun contextInterface() {
        strategy.algorithmInterface()
    }
}