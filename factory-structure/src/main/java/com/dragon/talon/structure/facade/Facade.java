package com.dragon.talon.structure.facade;

/**
 * 优点：
 * 减少系统的相互依赖
 * 提高了灵活性
 * 提高安全性
 * 缺点
 * 门面模式最大的缺点就是不符合开闭原则，对修改关闭，对扩展开放，看看我们那个门面对象吧，它可是重中之重，一旦在系统投产后发现有一个小错误，你怎么解决？完全遵从开闭原则，根本没办法解决。继承？覆写？都顶不上用，唯一能做的一件事就是修改门面角色的代码，这个风险相当大，这就需要大家在设计的时候慎之又慎，多思考几遍才会有好收获
 *
 * @author dragonboy
 */
public class Facade {
    private ClassA a = new ClassA();
    private ClassB b = new ClassB();
    private ClassC c = new ClassC();

    public void getAdonSomething() {
        this.a.dosomething();
    }

    public void getBdonSomething() {
        this.b.dosomething();
    }

    public void getCdonSomething() {
        this.c.dosomething();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.getAdonSomething();
        facade.getBdonSomething();
        facade.getCdonSomething();
    }
}
