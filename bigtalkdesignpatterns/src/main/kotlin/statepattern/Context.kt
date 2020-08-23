package statepattern

/**
 * @create on 2020/8/23 20:32
 * @description 上下文
 * @author mrdonkey
 */
class Context(var state: State) {

    /**
     * 发送请求
     */
    fun request() {
        state.handle(this)
    }
}