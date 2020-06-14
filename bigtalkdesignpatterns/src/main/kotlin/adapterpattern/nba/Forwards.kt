package adapterpattern.nba

/**
 * @create on 2020/6/14 14:27
 * @description 前锋
 * @author mrdonkey
 */
class Forwards : Player() {
    override fun action(command: String) {
        println("${this.javaClass.simpleName}----->$command")
    }
}