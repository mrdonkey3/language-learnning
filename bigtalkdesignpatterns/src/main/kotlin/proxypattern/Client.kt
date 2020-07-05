package proxypattern

/**
 * @create on 2020/7/5 22:52
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val proxy = Proxy()
            proxy.request()
        }
    }
}