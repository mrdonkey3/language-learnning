package adapterpattern.adapter

/**
 * @create on 2020/6/14 14:13
 * @description 目标类，这是客户所期待的接口或（具体/抽象）类。
 * @author mrdonkey
 */
open class Target {
  open fun request() {
        println("普通请求！")
    }
}