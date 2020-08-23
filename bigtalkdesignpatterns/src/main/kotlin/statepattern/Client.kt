package statepattern

/**
 * @create on 2020/8/23 20:31
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val context = Context(ConcreteState1())//初始化状态为状态1
            context.request()//不断的请求，并改变状态
            context.request()
            context.request()
            //此例比较简单，还可以应用在通过传入不同的条件来决定使用哪个状态或是否要切换到哪个状态进行处理
        }
    }
}