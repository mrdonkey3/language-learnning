package flyweightpattern.flyweightpattern

/**
 * @create on 2020/5/23 23:06
 * @description 客户端代码
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            //外部状态
            var extrinsicstate = 22
            FlyweightFactory().apply {
                this.getFlyweight("1")?.operation(--extrinsicstate)
                this.getFlyweight("2")?.operation(--extrinsicstate)
                this.getFlyweight("3")?.operation(--extrinsicstate)
            }
            UnsharedConcreteFlyweight().operation(--extrinsicstate)
        }
    }
}