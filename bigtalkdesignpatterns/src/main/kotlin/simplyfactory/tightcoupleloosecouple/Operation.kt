package simplyfactory.tightcoupleloosecouple

/**
 * @create on 2020/4/23 23:26
 * @description 利用继承和多态来减少耦合
 * @author mrdonkey
 */
abstract class Operation {
    abstract fun getResult(numberA: Double, numberB: Double): Double
}