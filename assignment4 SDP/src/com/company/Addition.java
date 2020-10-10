package com.company;

public class Addition implements Expression{
    @Override
    public double exec(double firstNumber, double secondNumber) {
        return (firstNumber + secondNumber);
    }
}
