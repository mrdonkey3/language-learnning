package visitorpattern.visitorpattern

/**
 * @create on 2020/4/19 10:19
 * @description 具体元素B
 * @author mrdonkey
 */
class ConcreteElementB : Element() {
    override fun accept(visitor: Visitor) {
        visitor.visitorConcreteElementB(this)
    }

    /**
     * 具体的其他方法
     */
    fun operationB(){

    }
}