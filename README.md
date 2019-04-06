简单的 设计模式 的实现

 为巩固自己的基础
 
 预计写 24中常用设计模式
 
        在每个模式的关键类中含有解释
### 创建型模式 
 
 -  #### 工厂模式：
    
     - ##### [普通的工厂模式](https://github.com/GiftedDrogon/dragon-structure/blob/1450fda3505547dc0797a96336f835c904c465c3/factory-structure/src/main/java/com/dragon/talon/structure/factory/base/AnimalFactory.java)
        
      - ##### [抽象工厂模式](https://github.com/GiftedDrogon/dragon-structure/blob/1450fda3505547dc0797a96336f835c904c465c3/factory-structure/src/main/java/com/dragon/talon/structure/factory/abstraction/AbstractionFactory.java)
      
      
 -  ####                    单列模式：
 
    网上有七种设计模式，有区别的我个人就这五种，所以就写这五种，不知道的可以去百度另外两种
         
      - ##### [懒汉模式（不安全）](https://github.com/GiftedDrogon/dragon-structure/blob/ec3b935e2a763e9cb2f9874bb2f7692ee0164db2/factory-structure/src/main/java/com/dragon/talon/structure/singleton/UnsafeLazySingleton.java)
      
      - ##### [懒汉模式（安全）](https://github.com/GiftedDrogon/dragon-structure/blob/ec3b935e2a763e9cb2f9874bb2f7692ee0164db2/factory-structure/src/main/java/com/dragon/talon/structure/singleton/SafeLazySingletion.java)
      
      - ##### [饿汉模式](https://github.com/GiftedDrogon/dragon-structure/blob/ec3b935e2a763e9cb2f9874bb2f7692ee0164db2/factory-structure/src/main/java/com/dragon/talon/structure/singleton/HungerSingletion.java)
      
      - ##### [静态加载饿汉模式](https://github.com/GiftedDrogon/dragon-structure/blob/ec3b935e2a763e9cb2f9874bb2f7692ee0164db2/factory-structure/src/main/java/com/dragon/talon/structure/singleton/StaticSingleton.java)

      - ##### [枚举模式](https://github.com/GiftedDrogon/dragon-structure/blob/ec3b935e2a763e9cb2f9874bb2f7692ee0164db2/factory-structure/src/main/java/com/dragon/talon/structure/singleton/SingletonEnum.java)
      
  - ####    [建筑者模式](https://github.com/GiftedDrogon/dragon-structure/blob/b598aa91d8c311422af595261cd3daa0ba6eea49/factory-structure/src/main/java/com/dragon/talon/structure/build/Builder.java)：
          一种比简单工厂模式相识但又比工厂模式复杂的设计模式，它通过指挥者来分配创建对象
  - ####    [原型模式](https://github.com/GiftedDrogon/dragon-structure/blob/b598aa91d8c311422af595261cd3daa0ba6eea49/factory-structure/src/main/java/com/dragon/talon/structure/prototype/PrototypePattern.java)   
  
  - ####    [模版模式]()
### 结构模式
  - ####    [代理模式]()
  - ####    [适配器模式]()
  - ####    [桥接模式]()
  - ####    [组合模式]()
  - ####    [装饰者模式]()
  - ####    [门面模式]()
  
  <br>
  
  ##### 比较 代理模式与装饰者模式的区别
     代理模式 对于被代理类是否使用具有确定的权利，你通过代理类去调用被代理类的时候，代理类可以拒绝
           对于动态代理来说，代理类可以代理被代理类的所有方法，装饰者不可以
     装饰者模式 这是对被装饰类起到一个加强的作用，无调用决策
  ##### 比较 适配器模式与装饰者模式的区别
       意图不同
         装饰者模式适用于强化某一个功能
         适配器是两个不同对象之间的转化
       施与对象不同
         装饰模式装饰的对象必须是自己的同宗，也就是相同的接口或父类
         适配器模式则必须是两个不同的对象，因为它着重于转换，只有两个不同的对象才有转换的必要，如果是相同对象还转换什么？！
       场景不同
         装饰模式在任何时候都可以使用，只要是想增强类的功能
         适配器模式则是一个补救模式
       扩展性不同
         装饰模式很容易扩展
         适配器模式就不同了，它在两个不同对象之间架起了一座沟通的桥梁，建立容易，去掉就比较困难了
         
