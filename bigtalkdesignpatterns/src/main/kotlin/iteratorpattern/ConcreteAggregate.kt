package iteratorpattern

/**
 * @create on 2020/8/23 23:53
 * @description 具体的聚集类
 * @author mrdonkey
 */
class ConcreteAggregate : Aggregate() {

    private val items = arrayListOf<Any>()

    override fun createIterator(): Iterator {
        return ConcreteIterator(this)
    }

    fun count() = items.size

    fun get(index: Int) = items.getOrNull(index)

    fun set(index: Int, obj: Any) = items.set(index, obj)

    fun addAll(arrays: List<Any>) {
        items.addAll(arrays)
    }
}