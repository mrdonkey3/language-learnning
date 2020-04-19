/**
 * <p>文件描述：<p>
 * <p>作者：Mr-Donkey<p>
 * <p>创建时间：2019/12/18 23:00<p>
 * <p>更改时间：2019/12/18 23:00<p>
 * <p>版本号：1<p>
 *
 */
class Presenter {
    private val model: Model = Model()
    private var data: ArrayList<String> = arrayListOf()

    companion object {
        private var isfirst = true
        @JvmStatic
        fun main(vararg args: String) {
            val presenter = Presenter()
            presenter.data = presenter.model.data
            while (true) {
                Thread.sleep(50)
                if (isfirst) {
                    isfirst = false
                    presenter.model.doLogic()
                }
                presenter.data.add("3")
                presenter.data.toString().println()
            }
        }
    }

}