package abstractfactorypattern

/**
 * @create on 2020/8/25 08:11
 * @description 产品B2工厂
 * @author mrdonkey
 */
class ProductB2Factory : AbstractFactory() {

    override fun createProduct(): AbstractProduct {
        return ProductB2()
    }
}