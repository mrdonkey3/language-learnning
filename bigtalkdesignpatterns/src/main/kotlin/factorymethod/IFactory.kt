package factorymethod

/**
 * @create on 2020/8/23 15:14
 * @description 工厂接口
 * @author mrdonkey
 */
interface IFactory {
    /**
     * 提供一个创建产品的方法
     */
    fun createProduct(): Product
}