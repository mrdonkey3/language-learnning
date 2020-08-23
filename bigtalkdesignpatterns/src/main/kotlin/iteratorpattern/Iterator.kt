package iteratorpattern

/**
 * @create on 2020/8/23 23:48k
 * @description 抽象迭代器
 * @author mrdonkey
 */
abstract class Iterator {

    abstract fun first(): Any?

    abstract fun next(): Any?

    abstract fun isDone(): Boolean

    abstract fun currentItem(): Any?
}