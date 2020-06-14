package singletonpattern.hungry

import singletonpattern.lazy.LazySingleton

/**
 * @create on 2020/6/14 12:09
 * @description 饿汉式 单例模式
 * @author mrdonkey
 */
class  HungrySingleton {
    private constructor()

    companion object {
        private val instance: HungrySingleton = HungrySingleton()//val 引用不可更改

        @JvmStatic
        fun getInstance(): HungrySingleton {
            return instance
        }
    }
}