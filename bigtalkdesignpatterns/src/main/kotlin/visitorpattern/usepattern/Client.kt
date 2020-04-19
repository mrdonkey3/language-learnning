package visitorpattern.usepattern

/**
 * @create on 2020/4/19 09:51
 * @description 客户端
 * @author mrdonkey
 */
class Client {

    companion object {
        @JvmStatic
        fun main(vararg arg: String) {
            val objectStructure = ObjectStructure()
            objectStructure.attach(Man())
            objectStructure.attach(Woman())
            //成功时的反应
            objectStructure.display(Success())
            //失败时的反应
            objectStructure.display(Failing())
            //恋爱时的反应
            objectStructure.display(Amativeness())
        }
    }
}