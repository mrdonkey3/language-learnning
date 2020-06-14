package singletonpattern.lazy

/**
 * @create on 2020/6/14 12:17
 * @description 双重检索、饿汉式 单例模式 针对多线程的情况 保证线程安全
 * @author mrdonkey
 */
class LazyDCLSingleton {
    private constructor()

    companion object {
        private var instance: LazyDCLSingleton? = null

        @JvmStatic
        fun getInstance(): LazyDCLSingleton {
            if (instance == null) {//第一重
                synchronized(this) {
                    if (instance == null) {//第二重
                        instance = LazyDCLSingleton()
                    }
                }
            }
            return instance as LazyDCLSingleton
        }
    }
}