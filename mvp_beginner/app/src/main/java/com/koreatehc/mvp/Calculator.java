package com.koreatehc.mvp;

public class Calculator {
    private double result;

    public void sum(int a, int b) {
        result = a + b;
    }

    public void divide(int a, int b) {
        if (b == 0) throw new ArithmeticException("분모가 0이면 안됩니다.");
        else result = a / b;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
