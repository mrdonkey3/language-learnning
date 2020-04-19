package commandpattern.loosecouple

import commandpattern.tightlycouple.Barbecuer

/**
 * @create on 2020/4/18 17:14
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            //开店前准备
            val boy = Barbecuer()
            val bakeChickenWingCommand = BakeChickenWingCommand(boy)
            val bakeMuttonCommand = BakeMuttonCommand(boy)
            val girl = Waiter()
            //开门准备 顾客点菜
            girl.setOrder(bakeChickenWingCommand, bakeMuttonCommand,bakeMuttonCommand)
            //点菜完毕,通知厨房
            girl.doNotify()
        }
    }
}