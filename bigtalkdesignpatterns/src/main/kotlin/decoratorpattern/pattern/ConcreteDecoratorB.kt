package decoratorpattern.pattern

/**
 * @create on 2020/7/5 22:14
 * @description 具体的装饰者
 * @author mrdonkey
 */
class ConcreteDecoratorB: Decorator() {

    override fun operation() {
        super.operation()
        addBehaviorB()
        println("具体装饰对象B的操作")
    }

    /**
     * 装饰者A独有方法
     */
    private fun addBehaviorB(){

    }
}