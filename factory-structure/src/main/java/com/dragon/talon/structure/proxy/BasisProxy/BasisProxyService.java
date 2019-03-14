package com.dragon.talon.structure.proxy.BasisProxy;

/**
 * 代理者
 * 
 * @author dragonboy 
 */
public class BasisProxyService implements IBasisProxy{
    private IBasisProxy client;

    public BasisProxyService(String name) {
        this.client = new ProxyClient(name,this);
    }

    @Override
    public void login(String name) {
        this.client.login(name);
    }

    @Override
    public void kill() {
        this.client.kill();
    }

    @Override
    public void upgrade() {
        this.client.upgrade();
    }
}
