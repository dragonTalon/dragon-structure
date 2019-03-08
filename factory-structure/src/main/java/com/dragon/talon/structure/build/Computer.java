package com.dragon.talon.structure.build;

/**
 * 具体产品
 * 
 * @author dragonboy 
 */
public class Computer {
    /**
     * cpu
     */
    private String cpu;
    /**
     * 主板
     */
    private String motherboar;
    /**
     * 内存
     */
    private String ram;
    /**
     * 显卡
     */
    private String graphicsCard;
    /**
     * 电源
     */
    private String power;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMotherboar() {
        return motherboar;
    }

    public void setMotherboar(String motherboar) {
        this.motherboar = motherboar;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", motherboar='" + motherboar + '\'' +
                ", ram='" + ram + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
