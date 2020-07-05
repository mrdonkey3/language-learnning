package decoratorpattern.sample

/**
 * @create on 2020/7/5 22:36
 * @description 鞋子
 * @author mrdonkey
 */
class Shoes:Finery() {

    override fun show() {
        println("穿上鞋子")
        super.show()
    }
}