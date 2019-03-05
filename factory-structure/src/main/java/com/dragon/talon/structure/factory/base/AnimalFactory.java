package com.dragon.talon.structure.factory.base;

/**
 * 普通的工厂模式
 *  优点： 1、一个调用者想创建一个对象，只要知道其名称就可以了。 2、扩展性高，如果想增加一个产品，只要扩展一个工厂类就可以。 3、屏蔽产品的具体实现，调用者只关心产品的接口。
 *  缺点：每次增加一个产品时，都需要增加一个具体类和对象实现工厂，使得系统中类的个数成倍增加，在一定程度上增加了系统的复杂度，同时也增加了系统具体类的依赖。这并不是什么好事。
 *  
 *  ⚠️作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。有一点需要注意的地方就是复杂对象适合使用工厂模式，而简单对象，
 *  特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。如果使用工厂模式，就需要引入一个工厂类，会增加系统的复杂度。
 * @author dragonboy
 */
public class AnimalFactory {
    public static Animal distinguish(String animalType) {
        if (animalType == null || "".equals(animalType)) {
            throw new IllegalArgumentException("parameter wrong");
        }
        switch (animalType) {
            case Cat.name:
                return new Cat();
            case Dog.name:
                return new Dog();
            default:
                return null;
        }
    }

    public static void main(String[] args) {
        Animal animal = AnimalFactory.distinguish("dog");
        animal.say();
    }
}
