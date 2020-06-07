package mediatorpattern

/**
 * @create on 2020/6/7 22:41
 * @description 客户端类
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val mediator = ConcreteMediator()
            val colleagueA = ConcreteColleagueA(mediator)//让通过具体的同事类都安装有wechat这个中介
            val colleagueB = ConcreteColleagueB(mediator)
            mediator.colleagueA = colleagueA//让 wechat 指定这两个同事的存在
            mediator.colleagueB = colleagueB
            println("ConcreteColleagueA:发送消息--->在干嘛呢？")
            colleagueA.send("在干嘛呢？")
            println("ConcreteColleagueB:发送消息--->在发呆呀！")
            colleagueB.send("在发呆呀！")
        }
    }
}