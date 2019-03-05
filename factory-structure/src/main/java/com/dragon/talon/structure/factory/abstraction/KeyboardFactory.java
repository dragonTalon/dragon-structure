package com.dragon.talon.structure.factory.abstraction;

/**
 * 键盘工厂
 * 
 * @author dragonboy 
 */
public class KeyboardFactory extends AbstractionFactory { 
    @Override
    public Keyboard createFactory(String name){
      if (name == null || "".equalsIgnoreCase(name)){
          throw new IllegalArgumentException("paramter error");
      }
      if (name.equalsIgnoreCase("dell")){
          return new DellKeyboard();
      }
      if (name.equalsIgnoreCase("mac")){
          return new MacKeyboard();
      }
      return null;
  }

    @Override
    Mouse cerateMouse(String name) {
        return null;
    }
}
