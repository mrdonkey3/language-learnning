package bridgepattern.v2

/**
 * @create on 2020/6/9 22:28
 * @description 手机系统 包含多种软件
 * @author mrdonkey
 */
abstract class PhoneOS {

    lateinit var app: App//品牌需要关注软件

    /**
     * 软件安装
     */
    abstract fun install()
}