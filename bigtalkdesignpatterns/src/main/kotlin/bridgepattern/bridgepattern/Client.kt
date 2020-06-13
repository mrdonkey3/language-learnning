package bridgepattern.bridgepattern

/**
 * @create on 2020/6/9 23:35
 * @description 客户端类
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val abstraction = RefinedAbstraction()
            abstraction.implementor = ConcreteImplementorA()
            abstraction.operation()

            abstraction.implementor = ConcreteImplementorB()
            abstraction.operation()
        }
    }
}