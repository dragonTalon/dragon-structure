package com.dragon.talon.structure.decorator;

/**
 * 装饰一下，太丑了不能看
 * 
 * @author dragonboy 
 */
public class PackRealDecorator extends Decorator{
    private void rule(){
        System.out.println("A:0% B:%1 C:99%");
    }
    
    private void rank(){
        System.out.println("排名：10%");
    }
    
    private Decorator decorator;

    public PackRealDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    void results() {
        rule();
        decorator.results();
        rank();
    }

    @Override
    void ensure(String ok) {
        decorator.ensure(ok);
    }
}
