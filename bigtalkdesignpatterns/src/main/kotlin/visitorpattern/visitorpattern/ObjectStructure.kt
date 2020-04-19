package visitorpattern.visitorpattern

/**
 * @create on 2020/4/19 10:24
 * @description 对象结构
 * @author mrdonkey
 */
class ObjectStructure {
    private val elements = arrayListOf<Element>()
    fun attach(element: Element) {
        elements.add(element)
    }

    fun detach(element: Element) {
        elements.remove(element)
    }

    fun accept(visitor: Visitor) {
        elements.forEach { element ->
            element.accept(visitor)
        }
    }
}