package com.dragon.talon.structure.proxy.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * 代理工厂，模拟spring aop中的before这种
 * 
 * @author dragonboy 
 */
public class ProxyFactory {
    public static Object newInstance(Class<?>[] intefaces,IDynamicProxy obj){
        
        return Proxy.newProxyInstance(ProxyFactory.class.getClassLoader(),intefaces,new DynamicProxyHandler(obj));
    }
    
}
