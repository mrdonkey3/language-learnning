package mementopattern

/**
 * @create on 2020/8/23 21:32
 * @description 发起人
 * @author mrdonkey
 */
class Originator {
    private var state: String = "on"//初始状态
    private var caretaker: Caretaker = Caretaker()

    /**
     * 设置状态
     */
    fun setState(state: String) {
        this.state = state
    }

    /**
     * 显示当前的状态
     */
    fun showState() {
        println("state ---> $state")
    }

    /**
     * 创建备忘录，用来保存当前状态，以便恢复
     */
    fun createMemento() {
        caretaker.setMemento(Memento(state))
    }

    /**
     * 恢复状态
     */
    fun recoveryState() {
        this.state = caretaker.getMemento()?.state ?: state
    }
}