package com.dragon.talon.structure.factory.abstraction;

/**
 * 鼠标工厂
 * @author dragonboy 
 */
public class MouseFactory extends AbstractionFactory {
    @Override
    Keyboard createFactory(String name) {
        return null;
    }

    @Override
    public Mouse cerateMouse(String name){
        if (name == null || "".equalsIgnoreCase(name)){
            throw new IllegalArgumentException("paramter error");
        }
        if (name.equalsIgnoreCase("dell")){
            return new DellMouse();
        }
        if (name.equalsIgnoreCase("mac")){
            return new MacMouse();
        }
        return null;
    }
}
