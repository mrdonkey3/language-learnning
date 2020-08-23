package mementopattern

/**
 * @create on 2020/8/23 21:36
 * @description 备忘录的管理者,存储备忘录
 * @author mrdonkey
 */
class Caretaker {
    private var memento: Memento? = null

    fun setMemento(memento: Memento) {
        this.memento = memento
    }

    fun getMemento(): Memento? {
        return memento
    }
}