package adapterpattern.nba

/**
 * @create on 2020/6/14 14:30
 * @description 球场
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val forwards = Forwards()
            forwards.action("attack")
            val center = Center()
            center.action("attack")
            val chinaPlayer = Translator()
            chinaPlayer.action("attack")
            val guards = Center()
            guards.action("defense")
        }
    }
}