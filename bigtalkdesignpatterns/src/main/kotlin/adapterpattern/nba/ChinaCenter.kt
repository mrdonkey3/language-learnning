package adapterpattern.nba

/**
 * @create on 2020/6/14 14:35
 * @description 中国中锋球员 只会中文
 * @author mrdonkey
 */
class ChinaCenter {
    fun action(command: String) {
        println("${this.javaClass.simpleName}----->$command")
    }
}