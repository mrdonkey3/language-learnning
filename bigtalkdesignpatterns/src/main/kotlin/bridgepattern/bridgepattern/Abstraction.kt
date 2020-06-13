package bridgepattern.bridgepattern

/**
 * @create on 2020/6/9 23:28
 * @description 抽象部分
 * @author mrdonkey
 */
open class Abstraction {

    lateinit var implementor: Implementor

    open fun operation() {
        if (this::implementor.isInitialized) {//如果被初始化才执行
            implementor.operation()
        }
    }
}