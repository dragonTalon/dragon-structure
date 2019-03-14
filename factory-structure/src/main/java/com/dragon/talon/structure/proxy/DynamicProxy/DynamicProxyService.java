package com.dragon.talon.structure.proxy.DynamicProxy;

/**
 * @author dragonboy
 */
public class DynamicProxyService implements IDynamicProxy {
    private String name;
    public DynamicProxyService(String name ) {
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
        System.out.println("you kill Roshan");
    }

    @Override
    public void upgrade() {
        System.out.println("你成功 到达25级");
    }
}
