package mediatorpattern

/**
 * @create on 2020/6/7 22:37
 * @description 具体同事A
 * @author mrdonkey
 */
class ConcreteColleagueA(private val mediator: Mediator) : Colleague(mediator) {

    /**
     * 发送消息通过中介者进行转发
     */
    override fun send(msg: String) {
        mediator.forward(msg, this)
    }

    override fun receive(msg: String) {
        println("${this::class.java.simpleName}:收到消息--->$msg")
    }
}