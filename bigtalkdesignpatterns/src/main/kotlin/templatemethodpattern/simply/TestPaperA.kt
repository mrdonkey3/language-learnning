package templatemethodpattern.simply

/**
 * @create on 2020/4/24 14:48
 * @description 甲抄的试卷
 * @author mrdonkey
 */
class TestPaperA : TestPaper() {
    override fun answer1(): String {
        return "b"
    }

    override fun answer2(): String {
        return "c"
    }

    override fun answer3(): String {
        return "a"
    }

}