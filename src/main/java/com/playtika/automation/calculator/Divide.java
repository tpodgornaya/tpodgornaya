package com.playtika.automation.calculator;

public class Divide implements BinaryOperation {
    @Override
    public double resultFor(double left, double right) {
        return left / right;
    }
}
