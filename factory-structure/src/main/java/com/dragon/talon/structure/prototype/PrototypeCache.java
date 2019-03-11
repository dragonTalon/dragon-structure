package com.dragon.talon.structure.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * 类型缓存
 * @author dragonboy 
 */
public class PrototypeCache {
    private static Map<Integer,PrototypePattern> cache = new HashMap<>();
    
    public static PrototypePattern getCache(Integer type){ 
        PrototypePattern prototypePattern = cache.get(type);
        return (PrototypePattern)prototypePattern.clone();
    }
    
    public static void init(){
        Rectangle rectangle = new Rectangle();
        rectangle.setId(1);
        cache.put(rectangle.getId(),rectangle);
        
        Shape shape = new Shape();
        shape.setId(2);
        cache.put(shape.getId(),shape);
    }
    public static void main(String[] args) {
        PrototypeCache.init();
        PrototypePattern cache = PrototypeCache.getCache(1);
        cache.talkMe();

        PrototypePattern prototypePattern = PrototypeCache.getCache(2);
        prototypePattern.talkMe();

    }
}
