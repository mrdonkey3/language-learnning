package adapterpattern.nba

/**
 * @create on 2020/6/14 14:28
 * @description 中锋
 * @author mrdonkey
 */
class Center:Player() {
    override fun action(command: String) {
        println("${this.javaClass.simpleName}----->$command")
    }
}