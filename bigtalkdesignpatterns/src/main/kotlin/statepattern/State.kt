package statepattern

/**
 * @create on 2020/8/23 20:31
 * @description 抽象状态类
 * @author mrdonkey
 */
abstract class State {
    /**
     * 根据不同的状态进去处理
     */
    abstract fun handle(ctx: Context)
}