package prototypepattern

/**
 * @create on 2020/8/23 16:16
 * @description 原型类
 * @author mrdonkey
 */
abstract class Prototype(var name: String, var list: ArrayList<String>) : Cloneable {
    /**
     * 提供克隆对象的方法
     */
    abstract fun cloneObj(): Prototype

    override fun toString(): String {
        return "Prototype(name='$name',nameHashCode=${name.hashCode()}, list=$list , listHashCode=${list.hashCode()})"
    }

}