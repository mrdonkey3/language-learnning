package templatemethodpattern.templatemethodpattern

/**
 * @create on 2020/4/24 15:04
 * @description 具体的子类实现特定的逻辑操作
 * @author mrdonkey
 */
class ConcreteClassA : AbstractClass() {
    override fun primitiveOperation1() {
        println("具体类A 方法1的实现")
    }

    override fun primitiveOperation2() {
        println("具体类A 方法2的实现")
    }
}