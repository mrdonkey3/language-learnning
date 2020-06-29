package publishsubscribepattern.delegate

/**
 * @create on 2020/6/27 23:29
 * @description 事件委托主题
 * @author mrdonkey
 */
class ConcreteSubject : Subject {

    private var eventHandler: HashMap<Int, () -> Unit> = hashMapOf()//保存每个观察者需要更新的方法

    override fun notifyObserver() {
        eventHandler.forEach { event ->
            event.value()//执行方法
        }
    }

    fun attach(key: Int, event: () -> Unit) {
        eventHandler[key] = event
    }

    fun detach(key: Int) {
        eventHandler.remove(key)

    }


}