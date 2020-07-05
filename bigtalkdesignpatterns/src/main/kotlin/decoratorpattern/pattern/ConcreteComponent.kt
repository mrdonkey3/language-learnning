package decoratorpattern.pattern

import decoratorpattern.pattern.Component

/**
 * @create on 2020/7/5 22:08
 * @description 具体组件
 * @author mrdonkey
 */
class ConcreteComponent : Component() {
    override fun operation() {
        println("具体组件对象的操作")
    }
}