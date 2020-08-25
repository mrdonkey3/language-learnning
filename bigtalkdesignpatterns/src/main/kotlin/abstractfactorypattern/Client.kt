package abstractfactorypattern

/**
 * @create on 2020/8/25 08:17
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val productA1 = ProductA1Factory().createProduct()
            val productA2 = ProductA2Factory().createProduct()
            val productB1 = ProductB1Factory().createProduct()
            val productB2 = ProductB2Factory().createProduct()

        }
    }
}