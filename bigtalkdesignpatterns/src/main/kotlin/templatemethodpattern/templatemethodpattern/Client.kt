package templatemethodpattern.templatemethodpattern

/**
 * @create on 2020/4/24 15:09
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            val concreteA: AbstractClass = ConcreteClassA()
            concreteA.primitiveOperation1()
            concreteA.primitiveOperation2()
            val concreteB: AbstractClass = ConcreteClassB()
            concreteB.primitiveOperation1()
            concreteB.primitiveOperation2()
        }
    }
}