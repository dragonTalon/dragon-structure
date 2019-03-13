package com.dragon.talon.structure.model;


/**
 * 模版
 * @author dragonboy 
 */
public class TemplateDemo2Model extends TemplateModel {
    @Override
    void start() {
        System.out.println("开启用户T emplate 2");
    }

    @Override
    void stop() {
        System.out.println("删除用户 Template 2");
    }

    @Override
    void say() {
        System.out.println("Template 2 comming");
    }
}
