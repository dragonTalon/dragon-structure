package com.dragon.talon.structure.model;

/**
 * 模版模型
 * 
 * @author dragonboy 
 */
public abstract class TemplateModel {
    /**
     * start
     */
    abstract void start();

    /**
     * stop
     */
    abstract void stop();

    /**
     * say
     */
    abstract void say();

    public void run(){
        this.start();
        this.say();
        this.stop();
    }

    public static void main(String[] args) {
        TemplateModel templateModel = new TemplateDemoModel();
        templateModel.run();
    }
}
