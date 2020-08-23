package iteratorpattern

/**
 * @create on 2020/8/24 00:00
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val concreteAggregate = ConcreteAggregate()
            concreteAggregate.addAll(arrayListOf("a", "b", "c", "d", "e", "f"))
            val iterator = ConcreteIterator(concreteAggregate)

            while (!iterator.isDone()) {
                println("--->${iterator.currentItem()}")
                iterator.next()
            }
        }
    }
}