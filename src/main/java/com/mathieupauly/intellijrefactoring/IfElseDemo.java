package com.mathieupauly.intellijrefactoring;

public class IfElseDemo {

    public double calculateInsurance(double income) {
        return baseStrategyOn(income).andApplyItTo(income);
    }

    private InsuranceStrategy baseStrategyOn(double income) {
        if (income <= 10000) {
            return new InsuranceStrategy(0, 0.365, 0);
        } else if (income <= 30000) {
            return new InsuranceStrategy(10000, 0.2, 35600);
        } else if (income <= 60000) {
            return new InsuranceStrategy(30000, 0.1, 76500);
        } else {
            return new InsuranceStrategy(60000, 0.02, 105600);
        }
    }

}