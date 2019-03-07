package com.dragon.talon.structure.singleton;

/**
 * 安全的懒汉单列模式
 *
 * @author dragonboy
 */
public class SafeLazySingletion {
    private static volatile SafeLazySingletion safeLazySingletion;

    private SafeLazySingletion() {
    }

    public static SafeLazySingletion newInstance() {
        if (safeLazySingletion == null) {
            synchronized (safeLazySingletion) {
                if (safeLazySingletion == null) {
                    safeLazySingletion = new SafeLazySingletion();
                }
            }
        }
        return safeLazySingletion;
    }
}
