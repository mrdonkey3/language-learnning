package visitorpattern.usepattern


/**
 * @create on 2020/4/19 09:32
 * @description 状态抽象类
 * @author mrdonkey
 */
abstract class Action {

    /**
     * 得到男人的结论或反应
     */
    abstract fun getManConclusion(concreteElementA: Man)

    /**
     * 得到女人结论或反应
     */
    abstract fun getWomanConclusion(concreteElementB: Woman)

}