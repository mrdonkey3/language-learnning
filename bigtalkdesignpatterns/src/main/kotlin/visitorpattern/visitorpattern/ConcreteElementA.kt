package visitorpattern.visitorpattern

/**
 * @create on 2020/4/19 10:19
 * @description 具体元素A
 * @author mrdonkey
 */
class ConcreteElementA:Element() {
    override fun accept(visitor: Visitor) {
        visitor.visitorConcreteElementA(this)
    }
    /**
     * 具体的其他方法
     */
    fun operationA(){

    }
}