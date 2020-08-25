package abstractfactorypattern

/**
 * @create on 2020/8/25 08:11
 * @description 产品A1工厂
 * @author mrdonkey
 */
class ProductA1Factory : AbstractFactory() {

    override fun createProduct(): AbstractProduct {
        return ProductA1()
    }
}