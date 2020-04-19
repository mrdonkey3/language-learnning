package visitorpattern.usepattern

/**
 * @create on 2020/4/19 09:42
 * @description 抽象
 * @author mrdonkey
 */
abstract class Person {
    //接受状态
    abstract fun accept(visitor: Action)
}