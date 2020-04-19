package visitorpattern.visitorpattern

/**
 * @create on 2020/4/19 10:21
 * @description 具体访问者B
 * @author mrdonkey
 */
class ConcreteVisitorB : Visitor() {
    override fun visitorConcreteElementA(concreteElementA: ConcreteElementA) {
        println("${concreteElementA::class.java.simpleName}被${this::class.java.simpleName}访问")
    }

    override fun visitorConcreteElementB(concreteElementB: ConcreteElementB) {
        println("${concreteElementB::class.java.simpleName}被${this::class.java.simpleName}访问")
    }
}