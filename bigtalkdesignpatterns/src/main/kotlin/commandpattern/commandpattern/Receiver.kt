package commandpattern.commandpattern

/**
 * @create on 2020/4/18 17:38
 * @description Receiver类指定如何实施与执行一个请求相关的操作。任何一个类都可能成为一个接收者
 * @author mrdonkey
 */
class Receiver {
    /**
     * 接收者相应的操作
     */
    fun action() {
        println("执行请求")
    }
}