package com.dragon.talon.structure.proxy.BasisProxy;

/**
 * 基础代理
 *   IBasisProxy
 *    ∆         ∆
 *    |         |-----|
 *    |               |
 * BasisProxyService  | 
 *                ProxyClient 
 * @author dragonboy 
 */
public interface IBasisProxy {
    /**
     * @param name
     * 登入
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
        BasisProxyService proxyService = new BasisProxyService("talon");
        proxyService.login("talon");
        proxyService.kill();
        proxyService.upgrade();
    }
}
