package flyweightpattern.sencondversion

/**
 * @create on 2020/5/23 23:15
 * @description 具体网站类
 * @author mrdonkey
 */
class ConcreteWebSite(val name: String) : WebSite() {
    override fun use() {
        println("网站分类：$name")
    }
}