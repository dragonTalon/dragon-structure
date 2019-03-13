package com.dragon.talon.structure.model;

/**
 * 模版模型
 * 
 * @author dragonboy 
 */
public class TemplateDemoModel extends TemplateModel{
    @Override
    void start() {
        System.out.println("开启用户 Template ");
    }

    @Override
    void stop() {
        System.out.println("删除用户 Template ");
    }

    @Override
    void say() {
        System.out.println("Template  comming");
    }
}
