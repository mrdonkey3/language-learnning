package compositepattern

/**
 * @create on 2020/8/23 22:55
 * @description 客户端
 * @author mrdonkey
 */
class Client {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            //构建根节点
            val root = Composite("root")
            root.add(Leaf("Leaf A"))
            root.add(Leaf("Leaf B"))

            //根上长出分支X
            val compositeX = Composite("Composite X")
            compositeX.add(Leaf("Leaf XA"))
            compositeX.add(Leaf("Leaf XB"))
            root.add(compositeX)

            //分支X再长出分支
            val compositeXY = Composite("Composite XY")
            compositeXY.add(Leaf("Leaf XYA"))
            compositeXY.add(Leaf("Leaf XYB"))
            compositeX.add(compositeXY)

            //根部又长出叶子
            root.add(Leaf("Leaf C"))

            //显示大树的样子
            root.display(1)
        }
    }
}