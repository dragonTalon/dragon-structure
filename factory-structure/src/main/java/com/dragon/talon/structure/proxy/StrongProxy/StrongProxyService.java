package com.dragon.talon.structure.proxy.StrongProxy;

/**
 * 代理服务
 * 
 * @author dragonboy
 */
public class StrongProxyService implements IStrongProxy{
    private IStrongProxy client;

    public StrongProxyService(IStrongProxy client) {
        this.client = client;
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

    @Override
    public IStrongProxy getProxy() {
        return this;
    }
}
