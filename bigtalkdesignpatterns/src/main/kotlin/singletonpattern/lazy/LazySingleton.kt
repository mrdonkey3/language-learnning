package singletonpattern.lazy

/**
 * @create on 2020/6/14 12:10
 * @description 懒汉式 单例模式
 * @author mrdonkey
 */
class LazySingleton {
    private constructor()

    companion object {
        private var instance: LazySingleton? = null

        @JvmStatic
        fun getInstance(): LazySingleton {
            if (instance == null) {
                instance = LazySingleton()
            }
            return instance as LazySingleton
        }
    }
}