package compositepattern

/**
 * @create on 2020/8/23 22:47
 * @description 枝节点
 * @author mrdonkey
 */
class Composite(name: String) : Component(name) {

    //孩子
    private val children = arrayListOf<Component>()

    override fun add(component: Component) {
        children.add(component)
    }

    override fun remove(component: Component) {
        children.remove(component)
    }

    override fun display(depth: Int) {
        println(Array(depth) { "-" }.joinToString(" ") + name)//输出本身
        for (child in children) {//遍历其孩子
            child.display(depth + 2)
        }
    }

}