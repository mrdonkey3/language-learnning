package publishsubscribepattern

/**
 * @create on 2020/6/27 23:15
 * @description 具体观察者
 * @author mrdonkey
 */
class ConcreteObserver(var sub: ConcreteSubject, var name: String) : Observer() {
    private var observerState = ""

    override fun update() {
        observerState = sub.subjectState
        println("$name--->update:$observerState")
    }


}