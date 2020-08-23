package prototypepattern

/**
 * @create on 2020/8/23 16:17{}
 * @description 具体原型类1
 * @author mrdonkey
 */
class ConcretePrototype1(name: String, list: ArrayList<String>) : Prototype(name, list) {
    override fun cloneObj(): Prototype {
        return this.clone() as Prototype
    }
}