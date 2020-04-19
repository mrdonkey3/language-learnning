package visitorpattern.visitorpattern

/**
 * @create on 2020/4/19 10:27
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            val objectStructure = ObjectStructure()
            objectStructure.attach(ConcreteElementA())
            objectStructure.attach(ConcreteElementB())
            objectStructure.accept(ConcreteVisitorA())
            objectStructure.accept(ConcreteVisitorB())
        }
    }
}