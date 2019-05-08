package com.dragon.talon.structure.interpreter;

import java.util.Map;

public class VarExpression extends Expression {
    private String key;

    public VarExpression(String _key) {
        this.key = _key;
    }

    //从map中取之
    @Override
    public int interpreter(Map<String, Integer> var) {
        return var.get(this.key);
    }
}
