package mementopattern

/**
 * @create on 2020/8/23 21:44
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object{
        @JvmStatic
        fun main(args: Array<String>) {
            //创建一个发起人
            val originator = Originator()
            //改变初始状态
            originator.setState("off")
            //创建备忘录，保存当前状态
            originator.createMemento()
            //改变状态
            originator.setState("on")
            //突然想恢复状态
            originator.recoveryState()
            //输出
            originator.showState()
        }
    }
}