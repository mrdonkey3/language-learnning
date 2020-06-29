package publishsubscribepattern

/**
 * @create on 2020/6/27 23:23
 * @description 客户端类
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val concreteSubject = ConcreteSubject()
            concreteSubject.attach(ConcreteObserver(concreteSubject, "A"))
            concreteSubject.attach(ConcreteObserver(concreteSubject, "B"))
            concreteSubject.subjectState="HaHa"
            concreteSubject.notifyObserver()
        }
    }
}