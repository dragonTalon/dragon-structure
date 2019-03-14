简单的 设计模式 的实现

 为巩固自己的基础
 
 预计写 24中常用设计模式
 
        在每个模式的关键类中含有解释
 
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
   
   - ####    [代理模式]()