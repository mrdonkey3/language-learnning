package chainofresponsibility

/**
 * @create on 2020/8/23 13:45
 * @description Hanlder 处理者类
 * @author mrdonkey
 */
abstract class Handler {

    protected var mSuccessor: Handler? = null

    /**
     * 设置继承者
     */
    fun setSuccessor(successor: Handler): Handler {
        this.mSuccessor = successor
        return this
    }

    /**
     * 处理请求的方法
     */
    abstract fun handlerRequest(requestCode: Int)
}