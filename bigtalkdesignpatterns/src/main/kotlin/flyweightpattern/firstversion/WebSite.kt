package flyweightpattern.firstversion

/**
 * @create on 2020/5/23 22:44
 * @description 网站类
 * @author mrdonkey
 */
class WebSite constructor(private val name: String) {

    /**
     * [name] 网站名
     */
    fun use() {
        println("网站分类：$name")
    }
}