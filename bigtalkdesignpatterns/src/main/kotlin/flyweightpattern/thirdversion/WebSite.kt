package flyweightpattern.thirdversion

/**
 * @create on 2020/5/23 23:26
 * @description 网站抽象类
 * @author mrdonkey
 */
abstract class WebSite {
    abstract fun use(user: User)
}