package mediatorpattern

/**
 * @create on 2020/6/7 22:29
 * @description 具体的中介者
 * @author mrdonkey
 */
class ConcreteMediator : Mediator() {
    var colleagueA: Colleague? = null
    var colleagueB: Colleague? = null

    /**
     * 判断消息的来源，并转发给对应的同事
     */
    override fun forward(msg: String, colleague: Colleague) {
        when (colleague) {
            colleagueA -> {
                colleagueB?.receive(msg)
            }
            colleagueB -> {
                colleagueA?.receive(msg)
            }
        }
    }
}