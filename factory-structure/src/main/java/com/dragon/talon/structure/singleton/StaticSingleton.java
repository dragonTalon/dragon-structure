package com.dragon.talon.structure.singleton;

/**
 * 静态内部类
 *  利用classloader的机制保证初始化instance时只有一个线程，他与饿汉模式的区别在于当StaticSingleton类被加载的时候，
 *  对象不会被实例化，只有调用getInsatnce方法时才会实例化对象，这样将傻姑娘喷了启动时的加载
 * @author dragonboy 
 */
public class StaticSingleton {
    private static class Singleton{
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }
    private StaticSingleton(){}
    
    public static final StaticSingleton getInstance(){
        return Singleton.INSTANCE;
    }
}
