package proxypattern

/**
 * @create on 2020/7/5 22:49
 * @description 代理
 * @author mrdonkey
 */
class Proxy : Subject() {

    lateinit var realSubject: RealSubject

    override fun request() {
        //实现代理的关键，它保存了真实的主体对象
        if (!this::realSubject.isInitialized) {
            realSubject = RealSubject()
        }
        realSubject.request()
    }

}