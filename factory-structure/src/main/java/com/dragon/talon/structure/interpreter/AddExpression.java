package com.dragon.talon.structure.interpreter;

import java.util.Map;

public class AddExpression extends SymbolExpression {
    public AddExpression(Expression _left, Expression _right) {
        super(_left, _right);
    }

    //把左右两个表达式运算的结果加起来
    @Override
    public int interpreter(Map<String, Integer> var) {
        return super.left.interpreter(var) + super.right.interpreter(var);
    }
}