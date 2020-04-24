package templatemethodpattern.simply


/**
 * @create on 2020/4/24 14:54
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(vararg args: String) {
            println("甲抄的试卷")
            val paperA: TestPaper = TestPaperA()
            paperA.testQuestion1()
            paperA.testQuestion2()
            paperA.testQuestion3()
            println("乙抄的试卷")
            val paperB: TestPaper = TestPaperB()
            paperB.testQuestion1()
            paperB.testQuestion2()
            paperB.testQuestion3()
        }
    }
}