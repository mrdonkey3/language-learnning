package decoratorpattern.pattern

/**
 * @create on 2020/7/5 22:09
 * @description 装饰类
 * @author mrdonkey
 */
open class Decorator : Component() {

    lateinit var component: Component//待装饰的组件

    override fun operation() {
        if (this::component.isInitialized) {
            component.operation()//执行component的operation方法
        }
    }
}