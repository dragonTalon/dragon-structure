package com.dragon.talon.structure.adapter;

/**
 * 超人
 *  
 * @author dragonboy 
 */
public class SuperMan implements SuperHuman{
    private String skill;
    
    private String name;
    
    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void skill() {
        System.out.println("我的技能："+getSkill());
    }
}
