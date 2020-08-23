package proxypattern

/**
 * @create on 2020/7/5 22:48
 * @description 真实的实体
 * @author mrdonkey
 */
class RealSubject : Subject() {
    override fun request() {
        println("真实的请求")
    }
}