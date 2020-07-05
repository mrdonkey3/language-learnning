package decoratorpattern.sample

/**
 * @create on 2020/7/5 22:37
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val zs = Person("张三")

            val shoes = Shoes()
            val tShirts = TShirts()
            val jeans = Jeans()

            tShirts.component = zs//张三穿上t恤
            jeans.component = tShirts//张三穿上牛仔
            shoes.component = jeans//张三穿上鞋
            shoes.show()//穿完了！
        }
    }
}