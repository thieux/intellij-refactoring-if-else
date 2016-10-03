package com.mathieupauly.intellijrefactoring;

public class IfElseDemo {

    public double calculateInsurance(double income) {
        InsuranceStrategy strategy;
        if (income <= 10000) {
            strategy = new LowInsuranceStrategy();
        } else if (income <= 30000) {
            strategy = new MediumInsuranceStrategy();
        } else if (income <= 60000) {
            strategy = new HighInsuranceStrategy();
        } else {
            strategy = new VeryHighInsuranceStrategy();
        }
        return strategy.calculate(income);
    }

}