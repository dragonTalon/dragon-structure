package com.dragon.talon.structure.build;

/**
 * 指挥者
 * 
 * @author dragonboy 
 */
public class Director {
    public void construct(Builder builder){
        builder.creatCpu();
        builder.creategGaphicsCard();
        builder.createMotherboar();
        builder.createPower();
        builder.createRam();
    }
    
}
