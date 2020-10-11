package com.company;

import java.util.Stack;

public class Parser {
    public static int Parser(String count){
        Stack stack = new Stack();
        String[] tokenList = count.split(" ");
        for(int i=0;i<tokenList.length;i++){
            if(isOperator(tokenList[i])){
                Expression firstNumber = (Expression)stack.pop();
                Expression number = new Number(tokenList[i+1]);
                stack.push((number));
                Expression secondNumber = (Expression)stack.pop();
                Expression operator = getOperatorInstance(tokenList[i], firstNumber, secondNumber);
                i++;
                int result = operator.expression();
                stack.push(new Number(result));
            }
            else{
                Expression number = new Number(tokenList[i]);
                stack.push(number);
            }
        }
        return(((Expression)stack.pop()).expression());
    }

    public static boolean isOperator(String string) {
        if (string.equals("+") || string.equals("-") || string.equals("*") || string.equals("/"))
            return true;
        else
            return false;
    }


    public static Expression getOperatorInstance(String str, Expression first,
                                                 Expression second) {
        switch (str) {
            case "+":
                return new Addition(first, second);
            case "-":
                return new Substraction(first, second);
            case "*":
                return new Multiplication(first, second);
            default:
                return null;
        }
    }
}


public class Main {

    public static void main(String[] args) {
        String calculate = "5 + 5 - 3 * 2 * 2 + 1";
        System.out.println(new Parser(count));
    }
}
