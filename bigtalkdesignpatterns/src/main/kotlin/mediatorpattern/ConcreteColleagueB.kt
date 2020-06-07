package mediatorpattern

/**
 * @create on 2020/6/7 22:37
 * @description
 * @author mrdonkey
 */
class ConcreteColleagueB(private val mediator: Mediator) : Colleague(mediator) {
    override fun send(msg: String) {
        mediator.forward(msg, this)
    }

    override fun receive(msg: String) {
        println("${this::class.java.simpleName}:收到消息--->$msg")
    }
}