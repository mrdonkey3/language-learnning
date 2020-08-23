package chainofresponsibility

/**
 * @create on 2020/8/23 13:48
 * @description 处理者3:最初处理者，必须处理
 * @author mrdonkey
 */
class ConcreteHandler3 : Handler() {

    override fun handlerRequest(requestCode: Int) {
        println("${this::class.java.simpleName}是boss处理{$requestCode}请求")
    }
}