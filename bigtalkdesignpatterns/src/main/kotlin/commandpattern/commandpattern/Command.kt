package commandpattern.commandpattern

/**
 * @create on 2020/4/18 17:37
 * @description Command类用来声明执行操作的接口
 * @author mrdonkey
 */
abstract class Command constructor(val receiver: Receiver) {
    /**
     * 执行操作
     */
    abstract  fun execute()
}