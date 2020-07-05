package decoratorpattern.pattern

import decoratorpattern.pattern.ConcreteComponent
import decoratorpattern.pattern.ConcreteDecoratorA
import decoratorpattern.pattern.ConcreteDecoratorB

/**
 * @create on 2020/7/5 22:18
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val component = ConcreteComponent()
            val decoratorA = ConcreteDecoratorA()
            val decoratorB = ConcreteDecoratorB()

            //decoratorA包装component
            //decoratorB包装decoratorA
            //....层层装饰（包装）
            //本质上将装饰的component对象串联成单链表，最终逐个调用其operation方法
            decoratorA.component = component
            decoratorB.component = decoratorA
            decoratorB.operation()
        }
    }
}