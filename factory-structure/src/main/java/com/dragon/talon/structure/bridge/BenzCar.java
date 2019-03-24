package com.dragon.talon.structure.bridge;

/**
 * 奔驰车
 * @author dragonboy 
 */
public class BenzCar extends Bridge{

    public BenzCar(OperationType type) {
        super(type);
    }

    @Override
    void create() {
        System.out.println("创建奔驰车：类型："+getType().operation());
    }
}
