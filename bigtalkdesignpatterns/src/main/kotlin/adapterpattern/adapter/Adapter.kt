package adapterpattern.adapter

/**
 * @create on 2020/6/14 14:16
 * @description 适配器类（目标类的实现类），通过在内部包装一个需要适配的类Adaptee对象 ，把源接口转成目标接口。
 * 简单的来说，就是当目标类调用指定的方法时，内部实现执行适配的方法，达到适配的效果。
 * @author mrdonkey
 */
class Adapter : Target() {

    private val adaptee = Adaptee()//建立一个私有的Adaptee对象

    override fun request() {
        adaptee.specificRequest()//表面是Target的request方法，实际变成调用了想要适配的类的方法。
    }
}