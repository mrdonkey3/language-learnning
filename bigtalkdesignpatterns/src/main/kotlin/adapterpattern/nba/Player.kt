package adapterpattern.nba

/**
 * @create on 2020/6/14 14:24
 * @description 抽象球员类
 * @author mrdonkey
 */
abstract class Player {
    /**
     * 拥有一个接受命令而行动的方法
     */
    abstract fun action(command: String)
}