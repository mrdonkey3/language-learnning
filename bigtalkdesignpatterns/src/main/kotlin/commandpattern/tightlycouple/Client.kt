package commandpattern.tightlycouple

/**
 * @Create on 2020/4/16 22:27
 * @description 客户端（顾客）
 * @author Mrdonkey
 */
class Client {
    companion object {

        @JvmStatic
        fun main(vararg args: String) {
            val boy = Barbecuer()
            boy.bakeMutton()
            boy.bakeChickenWing()
            boy.bakeMutton()
            boy.bakeChickenWing()
        }
    }
}