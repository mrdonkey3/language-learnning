package commandpattern.loosecouple

import commandpattern.tightlycouple.Barbecuer

/**
 * @Create on 2020/4/18 16:23
 * @description 具体的烤鸡翅命令，通知烤肉者
 * @author mrdonkey
 */
class BakeChickenWingCommand constructor(receiver: Barbecuer) : Command(receiver) {
    override fun executeCommand() {
        receiver.bakeChickenWing()
    }
}