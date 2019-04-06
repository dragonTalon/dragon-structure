package com.dragon.talon.structure.decorator;

/**
 * 装饰模式
 *
 * @author dragonboy
 */
public abstract class Decorator {
    /**
     * 结果单
     */
    abstract void results();

    /**
     * 确认结果
     */
    abstract void ensure(String ok);

    public static void main(String[] args) {
        Decorator decorator = new RealDecorator();
        //这样肯定拿不出手，所以修饰一下
        decorator = new PackRealDecorator(decorator);
        decorator.results();
        //这样看就舒服多了
        decorator.ensure("talon");
    }
}
