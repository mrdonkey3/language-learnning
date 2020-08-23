package facade

/**
 * @create on 2020/8/23 17:42
 * @description 外观类，它需要了解所有的子系统的方法和属性，进行组合，以备外界调用
 * @author mrdonkey
 */
class Facade {

    private var one: SubSystem1 = SubSystem1()
    private var two: SubSystem2 = SubSystem2()
    private var three: SubSystem3 = SubSystem3()

    /**
     * 组合的方法
     */
    fun methodA() {
        one.method1()
    }

    /**
     * 组合的方法
     */
    fun methodB() {
        two.method2()
        three.method3()
    }
}