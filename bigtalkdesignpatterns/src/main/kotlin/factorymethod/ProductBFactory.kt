package factorymethod

/**
 * @create on 2020/8/23 15:13
 * @description 产品A工厂
 * @author mrdonkey
 */
class ProductBFactory : IFactory {
    override fun createProduct(): Product {
        return ProductB()
    }
}