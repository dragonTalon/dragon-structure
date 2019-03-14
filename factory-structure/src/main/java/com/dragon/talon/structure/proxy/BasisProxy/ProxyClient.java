package com.dragon.talon.structure.proxy.BasisProxy;

/**
 * 被代理类
 * 
 * @author dragonboy 
 */
public class ProxyClient implements IBasisProxy{
    private String name ;

    public ProxyClient(String name,IBasisProxy proxy) {
        if (proxy == null){
            throw new IllegalArgumentException("这个是代理模式，然后是创建代理对象了");
        }
        this.name = name;
    }

    @Override
    public void login(String name) {
        if (!this.name.equals(name)){
            throw new IllegalArgumentException("非法用户登入");
        }
        System.out.println("登入用户 名称：" +name);
    }

    @Override
    public void kill() {
        System.out.println(name + " 成功击杀 TB");
    }

    @Override
    public void upgrade() {
        System.out.println(name + "成功升级！");
    }
}
