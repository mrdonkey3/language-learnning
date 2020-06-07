package builderpattern

/**
 * @create on 2020/6/1 23:35
 * @description 具体建造者类1 建造具体的两个部件是部件A和部件B
 * @author mrdonkey
 */
class ConcreteBuilder1 : Builder() {

    private val product = Product()

    override fun builderComponentA() {
        product.add("component A")
    }

    override fun builderComponentB() {
        product.add("component B")
    }

    override fun getResult(): Product {
        return product
    }
}