package iteratorpattern

/**
 * @create on 2020/8/23 23:50
 * @description 聚集抽象类
 * @author mrdonkey
 */
abstract class Aggregate {

    abstract fun createIterator(): Iterator

}