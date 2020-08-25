package abstractfactorypattern

/**
 * @create on 2020/8/25 08:08
 * @description 抽象工厂
 * @author mrdonkey
 */
abstract class AbstractFactory {
    abstract fun createProduct(): AbstractProduct
}