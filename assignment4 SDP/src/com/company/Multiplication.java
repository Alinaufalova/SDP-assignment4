package com.company;

public class Multiplication implements Expression{
    @Override
    public double exec(double firstNumber, double secondNumber) {
        return (firstNumber * secondNumber);
    }
}
