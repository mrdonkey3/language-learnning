package visitorpattern.usepattern

/**
 * @create on 2020/4/19 09:35
 * @description 失败
 * @author mrdonkey
 */
class Failing : Action() {
    override fun getManConclusion(concreteElementA: Man) {
        println("${concreteElementA::class.java.simpleName} ${this::class.java.simpleName}时，闷头喝酒，谁也不用劝。")
    }

    override fun getWomanConclusion(concreteElementB: Woman) {
        println("${concreteElementB::class.java.simpleName} ${this::class.java.simpleName}时，眼泪汪汪，谁也劝不了。")
    }
}