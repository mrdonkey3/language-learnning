package builderpattern

/**
 * @create on 2020/6/1 23:35
 * @description 具体建造者类2 建造具体的两个部件是部件 X 和 部件 Y
 * @author mrdonkey
 */
class ConcreteBuilder2 : Builder() {

    private val product = Product()

    override fun builderComponentA() {
        product.add("component X")
    }

    override fun builderComponentB() {
        product.add("component Y")
    }

    override fun getResult(): Product {
        return product
    }
}