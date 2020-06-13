package bridgepattern.v2

/**
 * @create on 2020/6/9 22:38
 * @description 客户端调用
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            var brand: PhoneOS
            println("---IOS---")
            brand = IOS()
            brand.app = Game()
            brand.install()
            brand.app = Study()
            brand.install()
            brand.app = Effective()
            brand.install()

            println("---Android---")
            brand = Android()
            brand.app = Game()
            brand.install()
            brand.app = Study()
            brand.install()
            brand.app = Effective()
            brand.install()

            println("---鸿蒙---")
            brand = Harmony()
            brand.app = Game()
            brand.install()
            brand.app = Study()
            brand.install()
            brand.app = Effective()
            brand.install()

        }
    }
}