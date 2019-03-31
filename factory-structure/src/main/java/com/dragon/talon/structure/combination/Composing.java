package com.dragon.talon.structure.combination;

import java.util.Arrays;

/**
 * 组合模式
 *  一种"整体-部分的设计模式"
 *  
 *  组合模式分为 安全模式 与 透明模式
 * lz实现的就是安全模式
 * 而透明模式 就是将操作数组操作，这样使用起来对树叶与树枝都是透明的，也少去了强制转换的过程
 * @author dragonboy 
 */
public abstract class Composing {
    protected String name;
    
    public void operation(String name){
    }

    @Override
    public String toString() {
        return "Composing{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Compose root = new Compose();
        
        Compose childRoot = new Compose();
        
        Leaf leaf = new Leaf();
        leaf.operation("dragon");
        
        root.add(childRoot);
        childRoot.add(leaf);
       
        System.out.println( root.toString());
    }
}
