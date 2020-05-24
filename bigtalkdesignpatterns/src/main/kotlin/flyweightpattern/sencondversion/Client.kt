package flyweightpattern.sencondversion

/**
 * @create on 2020/5/23 23:21
 * @description 客户端代码
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            WebSiteFactory().apply {
                this.getWebSiteCategory("产品展示").use()
                this.getWebSiteCategory("产品展示").use()
                this.getWebSiteCategory("产品展示").use()
                this.getWebSiteCategory("博客").use()
                this.getWebSiteCategory("博客").use()
                this.getWebSiteCategory("博客").use()
                println("网站分类总数为：${getWebSiteCount()}")
            }
        }
    }
}