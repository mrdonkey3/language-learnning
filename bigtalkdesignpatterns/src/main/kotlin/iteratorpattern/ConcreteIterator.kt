package iteratorpattern

/**
 * @create on 2020/8/23 23:52
 * @description 具体的迭代器
 * @author mrdonkey
 */
class ConcreteIterator(val aggregate: ConcreteAggregate) : Iterator() {

    private var currentIndex = 0//指针，记录迭代到哪个位置

    override fun first(): Any? {
        return aggregate.get(0)
    }

    override fun next(): Any? {
        currentIndex++
        var tempObj: Any? = null
        if (currentIndex < aggregate.count()) {
            tempObj = aggregate.get(currentIndex)
        }
        return tempObj
    }

    override fun isDone(): Boolean {
        return currentIndex >= aggregate.count()
    }

    override fun currentItem(): Any? {
    return aggregate.get(currentIndex)
    }
}