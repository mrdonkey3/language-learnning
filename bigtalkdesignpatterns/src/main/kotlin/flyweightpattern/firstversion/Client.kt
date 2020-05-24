package flyweightpattern.firstversion

/**
 * @create on 2020/5/23 22:46
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            WebSite("产品展示").use()
            WebSite("产品展示").use()
            WebSite("产品展示").use()
            WebSite("博客").use()
            WebSite("博客").use()
            WebSite("博客").use()
        }
    }
}