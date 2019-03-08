package com.dragon.talon.structure.build;

/**
 * 建造者模型
 * 是一种与抽象工厂模型相识的一种模型，与工厂模型相比他多了一个指挥者
 * 作用是将一个简单的对象组建成一个复杂对象，属于一种创建型的设计模式
 * 结构：
 *  抽象的建造者  Builder
 *  具体产品建造
 *  指挥者
 *  产品
 *
 * @author dragonboy
 */
public abstract class Builder {
    protected Computer computer = new Computer();
    /**
     * cpu
     */
    abstract void creatCpu();

    /**
     * 主板
     */
    abstract void createMotherboar();

    /**
     * 内存
     */
    abstract void createRam();

    /**
     * 显卡
     */
    abstract void creategGaphicsCard();

    /**
     * 电源
     */
    abstract void createPower();

    public Computer getComputer() {
        return computer;
    }

    public static void main(String[] args) {
        CreateIntelBuilder intelBuilder = new CreateIntelBuilder();
        Director director = new Director();
        director.construct(intelBuilder);
        System.out.println(intelBuilder.getComputer().toString());
        
        CreateAmdBuilder amdBuilder = new CreateAmdBuilder();
        director.construct(amdBuilder);
        System.out.println(amdBuilder.getComputer().toString());
    }
}
