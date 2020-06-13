package bridgepattern.v2

/**
 * @create on 2020/6/9 22:31
 * @description IOS 系统的手机
 * @author mrdonkey
 */
class IOS : PhoneOS() {
    override fun install() {
        app.install()
    }
}