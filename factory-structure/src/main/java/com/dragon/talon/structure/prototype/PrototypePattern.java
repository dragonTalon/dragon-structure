package com.dragon.talon.structure.prototype;

/**
 * 原型模型
 *  这种模式是实现了一个原型接口，该接口用于创建当前对象的克隆。当直接创建对象的代价比较大时，
 *  则采用这种模式。例如，一个对象需要在一个高代价的数据库操作之后被创建。我们可以缓存该对象，在下一个请求时返回它的克隆，
 *  在需要的时候更新数据库，以此来减少数据库调用。
 *  
 *  何时使用: 1、当一个系统应该独立于它的产品创建，构成和表示时。
 *           2、当要实例化的类是在运行时刻指定时，例如，通过动态装载。
 *           3、为了避免创建一个与产品类层次平行的工厂类层次时。
 *           4、当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。
 *  如何解决：利用已有的一个原型对象，快速地生成和原型对象一样的实例。
 * @author dragonboy 
 */
public abstract class PrototypePattern implements Cloneable {
    private int id;

    protected String type;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    /**
     * 自我介绍
     */
    abstract void talkMe();
    
    @Override
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
