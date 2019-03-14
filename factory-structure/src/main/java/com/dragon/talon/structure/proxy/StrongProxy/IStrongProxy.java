package com.dragon.talon.structure.proxy.StrongProxy;

/**
 * 强制代理 与基础代理不同的是，强制代理是 通过真实对象去找代理对象
 * 可以理解为强制代理自带代理对象，你所有的操作还是通过这个代理对象来去调用真实对象
 * 
 * @author dragonboy 
 */
public interface IStrongProxy {
    
    /**
     * 用户登入
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

    /**
     * 获取代理对象
     * @return
     */
    IStrongProxy getProxy();
}
