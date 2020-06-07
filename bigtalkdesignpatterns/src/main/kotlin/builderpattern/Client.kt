package builderpattern

/**
 * @create on 2020/6/1 23:40
 * @description 客户端类
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            val director = Director()
            val concreteBuilder1 = ConcreteBuilder1()
            val concreteBuilder2 = ConcreteBuilder2()
            //指挥者用 ConcreteBuilder的方法来构造产品
            director.construct(concreteBuilder1)
            director.construct(concreteBuilder2)
            concreteBuilder1.getResult().show()
            concreteBuilder2.getResult().show()
        }
    }
}