package compositepattern

/**
 * @create on 2020/8/23 22:47
 * @description 叶子节点
 * @author mrdonkey
 */
class Leaf(name: String) : Component(name) {
    override fun add(component: Component) {
        println("cannot add from a leaf")
    }

    override fun remove(component: Component) {
        println("cannot remove from a leaf")
    }

    override fun display(depth: Int) {
        println(Array(depth) { "-" }.joinToString(" ") + name)
    }

}