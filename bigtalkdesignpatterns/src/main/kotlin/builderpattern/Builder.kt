package builderpattern

/**
 * @create on 2020/6/1 23:29
 * @description 抽象构造者，确定产品由两个部分componentA与componentB组成，并声明一个得到产品建造后结果的方法getResult
 * @author mrdonkey
 */
abstract class Builder {

    abstract fun builderComponentA()
    abstract fun builderComponentB()
    abstract fun getResult(): Product

}