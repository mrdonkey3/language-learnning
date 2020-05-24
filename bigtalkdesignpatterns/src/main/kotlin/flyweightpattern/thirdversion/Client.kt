package flyweightpattern.thirdversion

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
                this.getWebSiteCategory("产品展示").use(User("孙悟空"))
                this.getWebSiteCategory("产品展示").use(User("猪八戒"))
                this.getWebSiteCategory("产品展示").use(User("沙悟净"))
                this.getWebSiteCategory("博客").use(User("白龙马"))
                this.getWebSiteCategory("博客").use(User("白骨精"))
                this.getWebSiteCategory("博客").use(User("唐僧"))
                println("网站分类总数为：${getWebSiteCount()}")

                val a = "你好"
                val b = "你好"
                val c = String(StringBuffer("你好"))
                println("a==b ${a == b}")
                println("c==b ${c == b}")

            }
        }
    }
}