package com.dragon.talon.structure.build;

/**
 * 具体的产品搭建
 *
 * @author dragonboy
 */
public class CreateIntelBuilder extends Builder {
    private Computer computer = new Computer();

    @Override
    void creatCpu() {
        computer.setCpu("i7 8700");
    }

    @Override
    void createMotherboar() {
        computer.setMotherboar("微星 Z370");
    }

    @Override
    void createRam() {
        computer.setRam("金士顿 DDR4 8G");
    }

    @Override
    void creategGaphicsCard() {
        computer.setGraphicsCard("GTX 1080T");
    }

    @Override
    void createPower() {
        computer.setPower("海韵 750W");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
