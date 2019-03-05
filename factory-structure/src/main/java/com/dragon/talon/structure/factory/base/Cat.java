package com.dragon.talon.structure.factory.base;

/**
 * 猫
 * @author dragonboy 
 */
public class Cat implements Animal {
    public static final String name = "cat";
    
    public void say() {
        System.out.println("喵～喵～");
    }
}
