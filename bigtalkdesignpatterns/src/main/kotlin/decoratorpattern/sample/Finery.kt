package decoratorpattern.sample

/**
 * @create on 2020/7/5 22:30
 * @description 服饰类
 * @author mrdonkey
 */
open class Finery : Person() {

    lateinit var component: Person//人作为一个组件被装饰

    override fun show() {
        if (this::component.isInitialized) {
            component.show()
        }
    }
}