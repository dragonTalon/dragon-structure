package com.dragon.talon.structure.combination;

/**
 * 树叶
 * 
 * @author dragonboy 
 */
public class Leaf extends Composing {
    @Override
    public void operation(String name ) {
        this.name = name;
    }
}
