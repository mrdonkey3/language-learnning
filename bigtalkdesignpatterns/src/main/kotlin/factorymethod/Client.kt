package factorymethod

/**
 * @create on 2020/8/23 15:16
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val productA = ProductAFactory().createProduct()
            val productB = ProductBFactory().createProduct()
        }
    }
}