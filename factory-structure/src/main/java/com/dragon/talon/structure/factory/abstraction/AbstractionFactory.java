package com.dragon.talon.structure.factory.abstraction;

/**
 * 抽象工厂设计模式
 *  优点：当一个产品族中的多个对象被设计成一起工作时，它能保证客户端始终只使用同一个产品族中的对象。
 *  缺点：产品族扩展非常困难，要增加一个系列的某一产品，既要在抽象的 Creator 里加代码，又要在具体的里面加代码。
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
