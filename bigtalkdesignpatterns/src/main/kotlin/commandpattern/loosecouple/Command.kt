package commandpattern.loosecouple

import commandpattern.tightlycouple.Barbecuer

/**
 * @Create on 2020/4/18 16:15
 * @description 抽象命令
 * @author mrdonkey
 */
abstract class Command constructor(val receiver: Barbecuer) {
    //执行命令
    abstract fun executeCommand()
}