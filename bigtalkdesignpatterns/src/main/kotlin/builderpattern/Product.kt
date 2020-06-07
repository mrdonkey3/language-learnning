package builderpattern

/**
 * @create on 2020/6/1 23:26
 * @description 类产品，由多个部件组成
 * @author mrdonkey
 */
class Product {
    private val components = arrayListOf<String>()//部件

    /**
     * 添加产品部件
     */
    fun add(component: String) {
        components.add(component)
    }

    /**
     * 列举所有产品部件
     */
    fun show() {
        components.forEach {
            println("-----$it-----")
        }
    }
}