package visitorpattern.oop

/**
 * @create on 2020/4/19 00:19
 * @description 男人
 * @author mrdonkey
 */
class Man : Person() {

    override fun getConclusion() {
        when (state) {
            "成功" -> {
                println("${this::class.java.simpleName}${state}时，背后多半有一个伟大的女人。")
            }
            "失败" -> {
                println("${this::class.java.simpleName}${state}时，闷头喝酒，谁也不用劝。")
            }
            "恋爱" -> {
                println("${this::class.java.simpleName}${state}时，凡事不懂也要装懂。")
            }
        }
    }
}