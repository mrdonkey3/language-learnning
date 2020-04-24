package templatemethodpattern.templatemethodpattern

/**
 * @create on 2020/4/24 14:59
 * @description 抽象模板类
 * @author mrdonkey
 */
abstract class AbstractClass {

    /**
     * 模板方法，给出了逻辑的骨架而逻辑的组成是一些相应的抽象类
     * 他们都推迟到子类实现
     */
    fun templateMethod() {

    }
    //原始操作1
    abstract fun primitiveOperation1()
    //原始操作2
    abstract fun primitiveOperation2()
}