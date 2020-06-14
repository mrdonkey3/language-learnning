package adapterpattern.adapter

/**
 * @create on 2020/6/14 14:19
 * @description 客户端测试
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val target = Adapter()
            target.request()//达到adaptee能适合Target使用的效果。
        }
    }
}