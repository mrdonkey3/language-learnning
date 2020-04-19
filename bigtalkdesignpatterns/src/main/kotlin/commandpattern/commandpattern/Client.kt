package commandpattern.commandpattern

/**
 * @create on 2020/4/18 17:45
 * @description Cilent 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(vararg arg: String) {
            val receiver = Receiver()
            val cmd = ConcreteCommand(receiver)
            Invoker().setCommand(cmd)
                    .executeCommand()
        }

    }
}