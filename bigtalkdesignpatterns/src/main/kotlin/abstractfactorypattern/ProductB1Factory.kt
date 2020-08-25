package abstractfactorypattern

/**
 * @create on 2020/8/25 08:11
 * @description 产品B1工厂
 * @author mrdonkey
 */
class ProductB1Factory : AbstractFactory() {

    override fun createProduct(): AbstractProduct {
        return ProductB1()
    }
}