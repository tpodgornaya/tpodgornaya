package com.playtika.automation.calculator;

public class Radical implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return Math.pow(right, 1.0/left);
    }
}
