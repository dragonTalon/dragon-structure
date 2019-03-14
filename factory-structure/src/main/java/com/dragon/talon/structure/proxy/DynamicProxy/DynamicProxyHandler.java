package com.dragon.talon.structure.proxy.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理的实现
 * 
 * @author dragonboy 
 */
public class DynamicProxyHandler implements InvocationHandler {
    private IDynamicProxy obj;

    public DynamicProxyHandler(IDynamicProxy proxy) {
        this.obj = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (ProxyUtils.isBefore()){
            ProxyUtils.before();
        }
        System.out.println("正在进行 " + method.getName());
        Object invoke = method.invoke(obj,args);
        return invoke;
    }
}
