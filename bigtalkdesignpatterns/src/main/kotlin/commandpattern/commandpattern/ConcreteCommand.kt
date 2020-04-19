package commandpattern.commandpattern

/**
 * @create on 2020/4/18 17:41
 * @description 具体的Command 将一个接收者对象绑定于一个动作，调用该接受者相应的操作
 * @author mrdonkey
 */
class ConcreteCommand constructor(receiver: Receiver) : Command(receiver) {

    override fun execute() {
        receiver.action()
    }

}