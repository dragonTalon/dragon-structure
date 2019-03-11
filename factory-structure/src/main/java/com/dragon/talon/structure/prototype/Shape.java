package com.dragon.talon.structure.prototype;

/**
 * 原型实现
 *
 * @author dragonboy
 */
public class Shape extends PrototypePattern {
    public Shape() {
        type = "Shape";
    }

    @Override
    void talkMe() {
        System.out.println("my name is Shape");
    }
}
