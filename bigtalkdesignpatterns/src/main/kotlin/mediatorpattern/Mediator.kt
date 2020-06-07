package mediatorpattern

/**
 * @create on 2020/6/7 22:22
 * @description 抽象中介者
 * @author mrdonkey
 */
abstract class Mediator {
    /**
     * 定义一个抽象的转发消息的方法，得到同事对象和转发消息
     */
    abstract fun forward(msg: String, colleague: Colleague)
}