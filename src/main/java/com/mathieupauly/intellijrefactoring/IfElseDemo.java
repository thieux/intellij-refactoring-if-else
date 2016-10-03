package com.mathieupauly.intellijrefactoring;

public class IfElseDemo {

    private InsuranceStrategy strategy;

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return income * 0.365;
        } else if (income <= 30000) {
            return (income - 10000) * 0.2 + 35600;
        } else if (income <= 60000) {
            strategy = new HighInsuranceStrategy();
            return strategy.calculateVeryHighInsurance(income);
        } else {
            strategy = new VeryHighInsuranceStrategy();
            return strategy.calculateVeryHighInsurance(income);
        }
    }

}