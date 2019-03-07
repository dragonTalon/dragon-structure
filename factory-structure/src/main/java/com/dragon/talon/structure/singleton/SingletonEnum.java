package com.dragon.talon.structure.singleton;

/**
 * 单列模式 通过枚举实现
 * 
 * @author dragonboy 
 */
public enum SingletonEnum implements SingletonInter{
    /**
     * 单例模式创建
     */
    INSTNCE{
        @Override
        public void doSomething() {
            System.out.println("create single model");
        }
    };

    public static void main(String[] args) {
        SingletonEnum instnce = SingletonEnum.INSTNCE;
        instnce.doSomething();
    }
}
