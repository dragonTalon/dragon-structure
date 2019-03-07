package com.dragon.talon.structure.singleton;

/**
 * 懒汉单列模式 (不安全)
 * @author dragonboy 
 */
public class UnsafeLazySingleton {
    private static UnsafeLazySingleton unsafeLazySingleton;
    private UnsafeLazySingleton(){}
    
    public static UnsafeLazySingleton newInstance(){
        if (unsafeLazySingleton == null){
            unsafeLazySingleton = new UnsafeLazySingleton();
        }
        return unsafeLazySingleton;
    }
}
