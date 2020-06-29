package publishsubscribepattern.delegate

/**
 * @create on 2020/6/27 23:35
 * @description 事件委托客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val concreteSubject = ConcreteSubject()
            concreteSubject.attach(1) { ConcreteObserverA().updateObserverA() }
            concreteSubject.attach(2) { ConcreteObserverB().updateObserverB() }
            concreteSubject.detach(2)
            concreteSubject.notifyObserver()
        }
    }
}