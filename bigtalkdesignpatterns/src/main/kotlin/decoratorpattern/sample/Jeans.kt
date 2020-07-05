package decoratorpattern.sample

/**
 * @create on 2020/7/5 22:35
 * @description 牛仔裤
 * @author mrdonkey
 */
class Jeans : Finery() {
    override fun show() {
        println("穿上牛仔裤")
        super.show()
    }
}