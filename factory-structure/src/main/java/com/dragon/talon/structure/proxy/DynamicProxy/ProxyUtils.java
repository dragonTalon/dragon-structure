package com.dragon.talon.structure.proxy.DynamicProxy;

/**
 * 代理工具
 * 简单点不用注解了
 *
 * @author dragonboy
 */
public class ProxyUtils {
    private static boolean Before;

    public static boolean isBefore() {
        return Before;
    }

    public static void openBefore() {
        Before = true;
    }
    public static void before(){
        System.out.println("在方法执行前运行");
    }
}
