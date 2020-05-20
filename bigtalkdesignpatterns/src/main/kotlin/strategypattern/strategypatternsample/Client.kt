package strategypattern.strategypatternsample

/**
 * @create on 2020/5/20 08:26
 * @description 客户端代码
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            //由于实例化不同的策略，所以最终结果在调用context.contextInterface时所获得的结果不尽相同
            var cxt = Context(ConcreteStrategyA())
            cxt.contextInterface()
            cxt = Context(ConcreteStrategyB())
            cxt.contextInterface()
            cxt = Context(ConcreteStrategyC())
            cxt.contextInterface()
        }
    }
}