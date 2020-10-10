package com.company;

public class Substraction implements Expression{
    @Override
    public double exec(double firstNumber, double secondNumber) {
        return (firstNumber - secondNumber);
    }
}
