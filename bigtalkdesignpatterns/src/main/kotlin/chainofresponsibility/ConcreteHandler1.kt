package chainofresponsibility

/**
 * @create on 2020/8/23 13:48
 * @description 处理者1
 * @author mrdonkey
 */
class ConcreteHandler1 : Handler() {

    override fun handlerRequest(requestCode: Int) {
        when (requestCode) {
            in 0 until 10 -> println("${this::class.java.simpleName}可处理的{$requestCode}请求")//0-9
            else -> {
                println("${this::class.java.simpleName}无法处理的{$requestCode}请求，交给上级")
                mSuccessor?.handlerRequest(requestCode)
            }
        }
    }
}