package chainofresponsibility

/**
 * @create on 2020/8/23 13:48
 * @description 处理者2
 * @author mrdonkey
 */
class ConcreteHandler2 : Handler() {

    override fun handlerRequest(requestCode: Int) {
        when (requestCode) {
            in 10 until 20 -> println("${this::class.java.simpleName}可处理的{$requestCode}请求")//10-19
            else -> {
                println("${this::class.java.simpleName}无法处理的{$requestCode}请求，交给上级")
                mSuccessor?.handlerRequest(requestCode)
            }
        }
    }
}