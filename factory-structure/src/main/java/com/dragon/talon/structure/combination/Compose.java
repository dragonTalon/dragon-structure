package com.dragon.talon.structure.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝
 * 
 * @author dragonboy 
 */
public class Compose extends Composing{
    private List<Composing> composingList = new ArrayList<>(10);
    
    public void add(Composing composing){
        composingList.add(composing);
    }
    
    public void remove(Composing composing){
        composingList.remove(composing);
    }

    public List<Composing> getComposingList() {
        return composingList;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Composing c:composingList){
            sb.append(c.toString());
        }
        return sb.toString();
    }

}
