package commandpattern.commandpattern

/**
 * @create on 2020/4/18 17:43
 * @description Invoker类 要求该Command执行这个请求
 * @author mrdonkey
 */
class Invoker {
    private var command: Command? = null

    fun setCommand(command: Command):Invoker{
        this.command = command
        return this
    }

    fun executeCommand() {
        command?.execute()
    }
}