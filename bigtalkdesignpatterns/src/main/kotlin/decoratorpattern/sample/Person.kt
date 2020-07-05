package decoratorpattern.sample

/**
 * @create on 2020/7/5 22:27
 * @description 人
 * @author mrdonkey
 */
open class Person constructor() {

    private var name: String? = null

    constructor(name: String) : this() {
        this.name = name
    }

    open fun show() {
        println("$name 今天的装扮")
    }
}