package flyweightpattern.thirdversion

import flyweightpattern.flyweightpattern.ConcreteFlyweight
import flyweightpattern.flyweightpattern.Flyweight

/**
 * @create on 2020/5/23 23:16
 * @description 网站工厂类
 * @author mrdonkey
 */
class WebSiteFactory {
    private val flyweights = hashMapOf<String, WebSite>()

    /**
     * 获得网站分类
     * 如果实例不存在，则创建
     */
    fun getWebSiteCategory(key: String): WebSite {
        return flyweights[key] ?: ConcreteWebSite(key).apply { flyweights[key] = this }

    }

    /**
     * 获得网站分类总数
     */
    fun getWebSiteCount() = flyweights.size

}