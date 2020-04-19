package visitorpattern.oop

/**
 * @create on 2020/4/19 00:22
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(vararg arg: String) {
            val persons = arrayListOf<Person>()
            val man1 = Man()
            man1.state="成功"
            val woman1 = Woman()
            woman1.state="成功"
            val man2 = Man()
            man2.state="失败"
            val woman2 = Woman()
            man2.state="失败"
            val man3 = Man()
            man3.state="恋爱"
            val woman3 = Woman()
            woman3.state="恋爱"
            persons.add(man1)
            persons.add(woman1)
            persons.add(man2)
            persons.add(woman2)
            persons.add(man3)
            persons.add(woman3)
            persons.forEach { person ->
                person.getConclusion()
            }

        }
    }
}