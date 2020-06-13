package bridgepattern.bridgepattern

/**
 * @create on 2020/6/9 23:29
 * @description 被提炼的抽象
 * @author mrdonkey
 */
 class RefinedAbstraction:Abstraction() {
    override fun operation() {
        implementor.operation()
    }
}