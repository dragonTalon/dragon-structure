package com.dragon.talon.structure.interpreter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 解释器模式
 * 
 * 抽象表达式
 * @author dragonboy 
 */
public abstract class Expression {
    //解析公式和数值，其中var中的key值是公式中的参数，value值是具体的数字
    public abstract int interpreter(Map<String,Integer> var);

    public static String getExpStr() throws IOException{
        System.out.print("请输入表达式：");
        return (new BufferedReader(new InputStreamReader(System.in))).readLine();
    }
    /***
     * 案例
     */
    //获得值映射
    public static HashMap<String,Integer> getValue(String exprStr) throws IOException {
        HashMap<String,Integer> map = new HashMap<String,Integer>();
        //解析有几个参数要传递
        for(char ch:exprStr.toCharArray()){
            if(ch != '+' && ch != '-'){
                //解决重复参数的问题
                if(!map.containsKey(String.valueOf(ch))){
                    String in = (new BufferedReader(new InputStreamReader(System.in))).readLine();
                    map.put(String.valueOf(ch),Integer.valueOf(in));
                }
            }
        }
        return map;
    }

    public static void main(String[] args) throws IOException {
        String expStr = getExpStr();
        HashMap<String, Integer> value = getValue(expStr);
        Expression expression = null;
        //定义一个栈，安排运算的先后顺序
        Stack<Expression> stack = new Stack();
        //表达式拆分为字符数组
        char[] charArray = expStr.toCharArray();
        //运算
        Expression left = null;
        Expression right = null;
        for(int i=0;i<charArray.length;i++){
            if ('+' == charArray[i]){
                left = stack.pop();
                right=new VarExpression(String.valueOf(charArray[++i]));
                stack.push(new AddExpression(left,right));
            }else {
                ;
                stack.push(new VarExpression(String.valueOf(charArray[i])));
            }
            
          
        }
        expression = stack.pop();
        System.out.println(expression.interpreter(value));
    }
}
