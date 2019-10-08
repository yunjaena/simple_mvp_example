package com.koreatehc.mvp;

public interface CalculatorView {
    void showCalculateResult(double result);

    void showFailCalculateResult(String message);

    void clearInput();
}
