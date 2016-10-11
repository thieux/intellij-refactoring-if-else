package com.mathieupauly.intellijrefactoring;

public class IfElseDemo {

    public double calculateInsurance(double income) {
        return baseStrategyOn(income).andApplyItTo(income);
    }

    private InsuranceStrategy baseStrategyOn(double income) {
        if (income <= 10000) {
            return InsuranceStrategy.LOW;
        } else if (income <= 30000) {
            return InsuranceStrategy.MEDIUM;
        } else if (income <= 60000) {
            return InsuranceStrategy.HIGH;
        } else {
            return InsuranceStrategy.VERY_HIGH;
        }
    }


}