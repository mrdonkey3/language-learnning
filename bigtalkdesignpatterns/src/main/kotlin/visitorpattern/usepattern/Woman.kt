package visitorpattern.usepattern

/**
 * @create on 2020/4/19 09:46
 * @description Woman
 * @author mrdonkey
 */
class Woman : Person() {
    override fun accept(visitor: Action) {
        visitor.getWomanConclusion(this)
    }
}