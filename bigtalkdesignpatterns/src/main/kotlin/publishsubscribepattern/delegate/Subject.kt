package publishsubscribepattern.delegate

/**
 * @create on 2020/6/27 23:28
 * @description 主题接口
 * @author mrdonkey
 */
interface Subject {
    fun notifyObserver()
}