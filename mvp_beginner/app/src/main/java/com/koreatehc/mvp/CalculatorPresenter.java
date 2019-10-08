package com.koreatehc.mvp;

public class CalculatorPresenter {
    private CalculatorView calculatorView;
    private Calculator calculator;

    public CalculatorPresenter(CalculatorView calculatorView) {
        this.calculatorView = calculatorView;
        calculator = new Calculator();
    }

    public void getAddResult(int a, int b)
    {
        calculator.sum(a,b);
        calculatorView.showCalculateResult(calculator.getResult());
        calculatorView.clearInput();
    }

    public void getDivideFunction(int a, int b)
    {
        try {
            calculator.divide(a, b);
            calculatorView.showCalculateResult(calculator.getResult());
        }
        catch (ArithmeticException e)
        {
            calculatorView.showFailCalculateResult(e.getMessage());
        }
        calculatorView.clearInput();
    }


}
