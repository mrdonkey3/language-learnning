package flyweightpattern.flyweightpattern

/**
 * @create on 2020/5/23 22:57
 * @description 具体的flyweight
 * @author mrdonkey
 */
class ConcreteFlyweight : Flyweight() {
    override fun operation(extrinsicstate: Int) {
        println("具体Flyweight:$extrinsicstate")
    }
}