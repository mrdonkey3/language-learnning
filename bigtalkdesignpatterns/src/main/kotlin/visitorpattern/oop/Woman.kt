package visitorpattern.oop

/**
 * @create on 2020/4/19 00:19
 * @description TODO
 * @author mrdonkey
 */
class Woman : Person() {

    override fun getConclusion() {
        when (state) {
            "成功" -> {
                println("${this::class.java.simpleName}${state}时，背后大多有一个不成功的男人。")
            }
            "失败" -> {
                println("${this::class.java.simpleName}${state}时，眼泪汪汪，谁也劝不了。")
            }
            "恋爱" -> {
                println("${this::class.java.simpleName}${state}，遇事懂也要装作不懂。")
            }
        }
    }
}