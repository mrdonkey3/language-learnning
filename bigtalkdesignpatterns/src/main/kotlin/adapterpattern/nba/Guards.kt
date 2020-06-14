package adapterpattern.nba

/**
 * @create on 2020/6/14 14:28
 * @description 后卫
 * @author mrdonkey
 */
class Guards :Player(){
    override fun action(command: String) {
        println("${this.javaClass.simpleName}----->$command")
    }
}