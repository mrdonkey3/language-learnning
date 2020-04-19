package visitorpattern.visitorpattern

/**
 * @create on 2020/4/19 10:17
 * @description 抽象元素
 * @author mrdonkey
 */
abstract class Element {
    //接受访问
    abstract fun accept(visitor: Visitor)
}