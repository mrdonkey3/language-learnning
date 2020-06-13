package bridgepattern.bridgepattern

/**
 * @create on 2020/6/9 23:31
 * @description 具体实现B
 * @author mrdonkey
 */
class ConcreteImplementorB:Implementor() {
    override fun operation() {
        println("----->具体实现B的方法执行")
    }
}