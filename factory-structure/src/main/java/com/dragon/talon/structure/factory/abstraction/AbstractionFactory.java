package com.dragon.talon.structure.factory.abstraction;

/**
 * 抽象工厂设计模式
 * 
 * @author dragonboy 
 */
public abstract class AbstractionFactory {
    abstract Keyboard createFactory(String name);

    abstract Mouse cerateMouse(String name);
    
    public static AbstractionFactory init(String factory){
        if (factory == null || "".equals(factory)){
            throw new IllegalArgumentException("paramter error");
        }
        if ("mouse".equalsIgnoreCase(factory)){
            return  new MouseFactory();
        }
        if ("keyboard".equalsIgnoreCase(factory)){
            return new KeyboardFactory();
        }
        return null;
    }

    public static void main(String[] args) {
        AbstractionFactory mouse = AbstractionFactory.init("mouse");
        Mouse mac = mouse.cerateMouse("mac");
        mac.mouseType();
    }
    
}
