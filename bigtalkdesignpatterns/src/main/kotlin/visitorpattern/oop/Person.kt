package visitorpattern.oop

/**
 * @create on 2020/4/19 00:14
 * @description 抽象类
 * @author mrdonkey
 */
abstract class Person {

    //状态
    var state: String? = null

    /**
     * 得到结论或者反应
     */
    abstract fun getConclusion()

}