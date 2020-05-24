package flyweightpattern.flyweightpattern

/**
 * @create on 2020/5/23 22:58
 * @description 指那些不需要共享的Flyweight子类
 * @author mrdonkey
 */
class UnsharedConcreteFlyweight : Flyweight() {
    override fun operation(extrinsicstate: Int) {
        println("不共享的具体Flyweight:$extrinsicstate")
    }
}