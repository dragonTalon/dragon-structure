package com.dragon.talon.structure.decorator;

/**
 * 真实结果
 * @author dragonboy 
 */
public class RealDecorator extends Decorator{

    @Override
    void results() {
        System.out.println("3：C,4:C");
    }

    @Override
    void ensure(String ok) {
        System.out.println("确定："+ok);
    }
}
