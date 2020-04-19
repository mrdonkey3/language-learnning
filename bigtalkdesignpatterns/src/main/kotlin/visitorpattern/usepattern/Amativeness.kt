package visitorpattern.usepattern

/**
 * @create on 2020/4/19 09:36
 * @description 恋爱
 * @author mrdonkey
 */
class Amativeness :Action(){
    override fun getManConclusion(concreteElementA: Man) {
        println("${concreteElementA::class.java.simpleName} ${this::class.java.simpleName}时，凡事不懂也要装懂。")
    }

    override fun getWomanConclusion(concreteElementB: Woman) {
        println("${concreteElementB::class.java.simpleName} ${this::class.java.simpleName}时，遇事懂也要装作不懂。")
    }
}