package flyweightpattern.flyweightpattern

/**
 * @create on 2020/5/23 22:53
 * @description 所有具体享元类的超类，通过这个接口，Flyweight可以接受并作用于外部状态
 * @param [extrinsicstate] 外部状态
 * @author mrdonkey
 */
abstract class Flyweight {
    abstract fun operation(extrinsicstate: Int)
}