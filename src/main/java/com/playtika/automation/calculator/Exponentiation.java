package com.playtika.automation.calculator;

public class Exponentiation implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        double x = left;
        double y = right;
        return Math.pow(x, y);
    }
}
