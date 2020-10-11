package com.company;

public class Multiplication implements Expression{
    private Expression firstNumber;
    private Expression secondNumber;

    public Multiplication(Expression firstNumber, Expression secondNumber){
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
    }
    @Override
    public int expression() {
        return firstNumber.expression() * secondNumber.expression();
    }
}
