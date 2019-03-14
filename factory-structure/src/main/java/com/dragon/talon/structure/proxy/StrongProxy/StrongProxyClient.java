package com.dragon.talon.structure.proxy.StrongProxy;

/**
 * 被代理对象
 *
 * @author dragonboy
 */
public class StrongProxyClient implements IStrongProxy {
    private String name;

    private IStrongProxy proxy;

    public StrongProxyClient(String name) {
        this.name = name;
        proxy = new StrongProxyService(this);
    }

    @Override
    public void login(String name) {
        if (!isProxy()) {
            System.out.println("你不能直接登入，先去找我小弟");
        }
        this.name = name;
        System.out.println("登入成功");
    }

    @Override
    public void kill() {
        if (isProxy()) {
            System.out.println("you kill Roshan");
            return;
        }
        System.out.println("你怎么会是这种事交给小弟做啊，怎么能自己动手了");
    }

    @Override
    public void upgrade() {
        if (isProxy()) {
            System.out.println("你成功 到达25级");
            return;
        }
        System.out.println("你怎么会是这种事交给小弟做啊，升级都不用管啊");
    }

    @Override
    public IStrongProxy getProxy() {
        return proxy;
    }

    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        IStrongProxy client = new StrongProxyClient("talon");
        IStrongProxy proxy = client.getProxy();
        proxy.login("talon");
        proxy.kill();
        proxy.upgrade();
    }
}

