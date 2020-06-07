package mediatorpattern

/**
 * @create on 2020/6/7 22:23
 * @description 抽象同事类 [mediator] 构造方法，得到中介者对象
 * @author mrdonkey
 */
abstract class Colleague(private val mediator: Mediator) {
    /**
     * 发送消息
     */
    abstract fun send(msg: String)

    /**
     * 接收消息
     */
    abstract fun receive(msg: String)
}