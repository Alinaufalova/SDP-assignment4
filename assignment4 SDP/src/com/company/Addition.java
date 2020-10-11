package com.company;

public class Addition implements Expression {
    private Expression firstNumber;
    private Expression secondNumber;

    public Addition(Expression firstNumber, Expression secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
        @Override
        public int expression() {
            return firstNumber.expression() + secondNumber.expression();
    }

}