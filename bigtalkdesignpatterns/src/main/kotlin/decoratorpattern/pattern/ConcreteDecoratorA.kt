package decoratorpattern.pattern

/**
 * @create on 2020/7/5 22:14
 * @description 具体的装饰者
 * @author mrdonkey
 */
class ConcreteDecoratorA: Decorator() {

    override fun operation() {
        super.operation()
        println("具体装饰对象A的操作")
        addBehaviorA()
    }

    /**
     * 装饰者A独有方法
     */
    private fun addBehaviorA(){

    }
}