package bridgepattern.v2

/**
 * @create on 2020/6/9 22:37
 * @description Android 品牌
 * @author mrdonkey
 */
class Android : PhoneOS() {
    override fun install() {
        app.install()
    }
}