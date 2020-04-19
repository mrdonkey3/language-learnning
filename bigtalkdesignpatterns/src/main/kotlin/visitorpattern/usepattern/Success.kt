package visitorpattern.usepattern

/**
 * @create on 2020/4/19 09:34
 * @description 成功
 * @author mrdonkey
 */
class Success:Action() {
    override fun getManConclusion(concreteElementA: Man) {
        println("${concreteElementA::class.java.simpleName} ${this::class.java.simpleName}时，背后多半有一个伟大的女人。")
    }

    override fun getWomanConclusion(concreteElementB: Woman) {
        println("${concreteElementB::class.java.simpleName} ${this::class.java.simpleName}时，背后大多有一个不成功的男人。")
    }
}