package visitorpattern.usepattern

/**
 * @create on 2020/4/19 09:45
 * @description 男人
 * @author mrdonkey
 */
class Man:Person() {
    override fun accept(visitor: Action) {
        visitor.getManConclusion(this)
    }
}