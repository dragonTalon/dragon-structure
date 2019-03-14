package com.dragon.talon.structure.proxy.DynamicProxy;

/**
 * 动态代理
 * 
 * @author dragonboy 
 */
public interface IDynamicProxy {
    /**
     * 登入
     * @param name
     */
    void login(String name);

    /**
     * 击杀
     */
    void kill();

    /**
     * 升级
     */
    void upgrade();

    public static void main(String[] args) {
        ProxyUtils.openBefore();
        IDynamicProxy proxy = new DynamicProxyService("talon");
        IDynamicProxy proxyObj = (IDynamicProxy) ProxyFactory.newInstance(proxy.getClass().getInterfaces(), proxy);
        proxyObj.login("talon");
        proxyObj.kill();
        proxyObj.upgrade();
    }
}
