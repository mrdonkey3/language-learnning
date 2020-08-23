package facade

/**
 * @create on 2020/8/23 17:46
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val facade = Facade()//facade作用：客户端可以在根本不知道三个子系统的存在
            facade.methodA()//对子系统的方法进行整合，方便外部使用
            facade.methodB()
        }
    }
}