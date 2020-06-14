package singletonpattern.lazy

/**
 * @create on 2020/6/14 12:45
 * @description 懒汉式加锁单例模式
 * @author mrdonkey
 */
class LazyLockSingleton {
    private constructor()

    companion object {
        private var instance: LazyLockSingleton? = null

        @JvmStatic
        fun getInstance(): LazyLockSingleton {
            synchronized(this) {
                if (instance == null) {
                    instance = LazyLockSingleton()
                }
            }
            return instance as LazyLockSingleton
        }
    }
}