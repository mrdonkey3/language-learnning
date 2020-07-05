package decoratorpattern.sample

/**
 * @create on 2020/7/5 22:34
 * @description T恤
 * @author mrdonkey
 */
class TShirts : Finery() {

    override fun show() {
        println("穿上T恤")
        super.show()
    }
}