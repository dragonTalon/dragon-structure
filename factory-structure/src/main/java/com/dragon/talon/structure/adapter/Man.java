package com.dragon.talon.structure.adapter;

/**
 * 男人
 *
 * @author dragonboy
 */
public class Man implements Human {
    private String sex;

    private int age;

    private String name;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void info() {
        System.out.println("Man{" +
                "sex='" + sex + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}');
    }
}
