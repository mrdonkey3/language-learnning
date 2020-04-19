package commandpattern.loosecouple

import commandpattern.tightlycouple.Barbecuer

/**
 * @Create on 2020/4/18 16:20
 * @description 具体的烤羊肉串命令，通知烤肉者
 * @author mrdonkey
 */
class BakeMuttonCommand constructor(receiver: Barbecuer) : Command(receiver) {
    override fun executeCommand() {
        receiver.bakeMutton()
    }
}