package bridgepattern.bridgepattern

/**
 * @create on 2020/6/9 23:30
 * @description 具体实现A
 * @author mrdonkey
 */
class ConcreteImplementorA:Implementor() {
    override fun operation() {
        println("----->具体实现A的方法执行")
    }
}