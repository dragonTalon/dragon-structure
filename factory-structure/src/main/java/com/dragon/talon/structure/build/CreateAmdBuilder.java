package com.dragon.talon.structure.build;

/**
 * 具体搭建责
 *
 * @author dragonboy
 */
public class CreateAmdBuilder extends Builder {
    @Override
    void creatCpu() {
        computer.setCpu("2700x");
    }

    @Override
    void createMotherboar() {
        computer.setMotherboar("华硕 ROG X470");
    }

    @Override
    void createRam() {
        computer.setRam("芝奇 DDR4 8G");
    }

    @Override
    void creategGaphicsCard() {
        computer.setGraphicsCard("vega 56");
    }

    @Override
    void createPower() {
        computer.setPower("EVGA 750W");
    }

   
}
