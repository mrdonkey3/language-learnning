package adapterpattern.nba

/**
 * @create on 2020/6/14 14:33
 * @description 翻译者（中国球员的适配器，让中国球员能够听得懂） 为中国球员提供翻译
 * @author mrdonkey
 */
class Translator : Player() {

    private val chinaCenter = ChinaCenter()//表明翻译者与中国中锋球员有关联

    /**
     * s
     */
    override fun action(command: String) {
        chinaCenter.action(//告诉中国中锋
            when (command) {
                "attack" -> {//翻译进攻
                    "进攻"
                }
                "defense" -> {//翻译防守
                    "防守"
                }
                else -> {
                    ""
                }
            }
        )
    }
}