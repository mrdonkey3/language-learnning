package flyweightpattern.flyweightpattern

/**
 * @create on 2020/5/23 22:59
 * @description 享元工常，用来创建并管理Flyweight对象
 * @author mrdonkey
 */
class FlyweightFactory {
    private val flyweights = hashMapOf<String, Flyweight>()

    /**
     * 初始化工厂，先生成3个共享实例
     */
    init {
        flyweights["1"] = ConcreteFlyweight()
        flyweights["2"] = ConcreteFlyweight()
        flyweights["3"] = ConcreteFlyweight()
    }

    /**
     * 根据客户端请求，获得已生成的实例
     */
    fun getFlyweight(key: String): Flyweight? {
        return flyweights[key]
    }

    /**
     * 获得网站分类总数
     */
    fun getWebSiteCount() = flyweights.size

}