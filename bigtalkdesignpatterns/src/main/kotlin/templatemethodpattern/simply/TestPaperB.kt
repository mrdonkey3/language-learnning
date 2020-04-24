package templatemethodpattern.simply

/**
 * @create on 2020/4/24 14:48
 * @description 乙抄的试卷
 * @author mrdonkey
 */
class TestPaperB : TestPaper() {
    override fun answer1(): String {
        return "c"
    }

    override fun answer2(): String {
        return "a"
    }

    override fun answer3(): String {
        return "a"
    }
}