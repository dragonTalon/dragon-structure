package com.dragon.talon.structure.prototype;

/**
 * 实现抽象
 * 
 * @author dragonboy 
 */
public class Rectangle extends PrototypePattern {
    public Rectangle(){
        type = "Rectangle";
    }


    @Override
    void talkMe() {
        System.out.println("my name is : Rectangle");
    }
}
