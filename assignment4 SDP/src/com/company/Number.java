package com.company;

public class Number implements Expression{
    private int number;

    public Number(int number){
        this.number = number;
    }

    @Override
    public int expression() {
        return number;
    }
}
