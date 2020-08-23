package prototypepattern

/**
 * @create on 2020/8/23 16:17
 * @description 客户端类
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val obj = ConcretePrototype1("tom", arrayListOf("1", "2", "3"))
            val cloneObj = obj.cloneObj()
            //克隆对象修改name
            println("----克隆对象修改name----")
            cloneObj.name = "jeny"
            println("obj-->$obj")
            println("cloneObj-->$cloneObj")
            //克隆对象更改list
            println("----克隆对象更改list----")
            cloneObj.list.add("4")
            println("obj-->$obj")
            println("cloneObj-->$cloneObj")
        }
    }
}