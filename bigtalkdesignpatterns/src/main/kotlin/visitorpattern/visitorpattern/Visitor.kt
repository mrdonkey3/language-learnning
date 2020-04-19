package visitorpattern.visitorpattern

/**
 * @create on 2020/4/19 10:16
 * @description 抽象访问者
 * @author mrdonkey
 */
abstract class Visitor {
    abstract fun visitorConcreteElementA(concreteElementA: ConcreteElementA)
    abstract fun visitorConcreteElementB(concreteElementB: ConcreteElementB)

}