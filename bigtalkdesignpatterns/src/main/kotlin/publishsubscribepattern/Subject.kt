package publishsubscribepattern

/**
 * @create on 2020/6/27 23:12
 * @description 主题类 抽象通知者
 * @author mrdonkey
 */
abstract class Subject {
    private val observers = arrayListOf<Observer>()

    fun attach(observer: Observer) {
        observers.add(observer)
    }

    fun detach(observer: Observer) {
        observers.remove(observer)
    }

    fun notifyObserver() {
        observers.forEach {
            it.update()
        }
    }
}