package compositepattern

/**
 * @create on 2020/8/23 22:42
 * @description 为组合对象声明接口
 * @author mrdonkey
 */
abstract class Component(val name: String) {

    /**
     * 添加部件
     */
    abstract fun add(component: Component)

    /**
     * 移除部件
     */
    abstract fun remove(component: Component)

    /**
     * 展示当前部件
     */
    abstract fun display(depth: Int)
}