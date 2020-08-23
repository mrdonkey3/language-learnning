package statepattern

/**
 * @create on 2020/8/23 20:31
 * @description 具体的状态2
 * @author mrdonkey
 */
class ConcreteState2 : State() {

    override fun handle(ctx: Context) {
        println("${this::class.java.simpleName}处理请求完毕，切换状态")
        ctx.state = ConcreteState1()
    }
}