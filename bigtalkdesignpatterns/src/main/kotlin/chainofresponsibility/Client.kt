package chainofresponsibility

/**
 * @create on 2020/8/23 13:54
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(vararg string: String) {
            val handler1 = ConcreteHandler1()
            val handler2 = ConcreteHandler2()
            val handler3 = ConcreteHandler3()
            //设置继承者（上级）
            handler1.setSuccessor(handler2)
            handler2.setSuccessor(handler3)
            //构建一个请求数组并开始进行请求
            for (requestCode in 0..20 step 5)
                handler1.handlerRequest(requestCode)
        }
    }
}