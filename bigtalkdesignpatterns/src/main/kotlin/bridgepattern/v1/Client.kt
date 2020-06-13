package bridgepattern.v1

/**
 * @create on 2020/6/8 23:50
 * @description 客户端代码
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var brand: PhoneOS

            brand = AndroidBilibili()
            brand.install()

            brand = AndroidLOL()
            brand.install()

            brand = IOSBilibili()
            brand.install()

            brand = IOSLOL()
            brand.install()

        }
    }
}