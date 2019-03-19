package com.dragon.talon.structure.adapter;

/**
 * 超人转换成普通人
 *      适配模式就是将两个没有关系的两个对象 之间进行转换的时无法转换就做一个中介
 *      就像插头一样，你拿中国的东西去国外，这个时候就需要转换插头，这就是适配啊
 * @author dragonboy
 */
public class TransforAdapter extends SuperMan implements Human {

    @Override
    public void info() {
        String str = "Man{" +
                "skill='" + getSkill() + '\'' +
                ", name='" + getName() + '\'' +
                ",sex = 未知 , age = 未知" +
                '}';
        System.out.println(str);
    }

    public static void main(String[] args) {
        Human human  = new TransforAdapter();
        ((TransforAdapter) human).setName("超人");
        ((TransforAdapter) human).setSkill("飞");
        human.info();
    }
}
