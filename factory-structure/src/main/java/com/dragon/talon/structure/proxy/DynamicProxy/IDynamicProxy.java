package com.dragon.talon.structure.proxy.DynamicProxy;

import sun.misc.ProxyGenerator;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

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
        final Object instance = ProxyFactory.newInstance(proxy.getClass().getInterfaces(), proxy);
        String path = "proxyDemo.class";
        final byte[] bytes = ProxyGenerator.generateProxyClass("$Proxy0", proxy.getClass().getInterfaces());
        FileOutputStream out  = null;
        try {
            out = new FileOutputStream(path);
            out.write(bytes);
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if (out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

