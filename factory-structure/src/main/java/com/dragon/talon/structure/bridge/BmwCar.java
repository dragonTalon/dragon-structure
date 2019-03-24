package com.dragon.talon.structure.bridge;

/**
 * 宝马
 */
public class BmwCar extends Bridge {
    public BmwCar(OperationType type) {
        super(type);
    }

    @Override
    void create() {
        System.out.println("创建宝马：类型："+getType().operation());
    }
}
