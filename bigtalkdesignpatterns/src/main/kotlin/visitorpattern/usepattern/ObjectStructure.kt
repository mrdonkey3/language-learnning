package visitorpattern.usepattern

/**
 * @create on 2020/4/19 09:47
 * @description 对象结构
 * @author mrdonkey
 */
class ObjectStructure {

    private val elements = arrayListOf<Person>()

    //增加
    fun attach(element: Person) {
        elements.add(element)
    }

    //减少
    fun detach(element: Person) {
        elements.remove(element)
    }

    //展示
    fun display(visitor: Action) {
        elements.forEach { person ->
            person.accept(visitor)
        }
    }
}