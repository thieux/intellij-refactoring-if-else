package com.mathieupauly.intellijrefactoring;

public class VeryHighInsuranceStrategy {
    public VeryHighInsuranceStrategy() {
    }

    double calculateVeryHighInsurance(double income) {
        return (income - adjustment()) * weight() + constant();
    }

    int constant() {
        return 105600;
    }

    double weight() {
        return 0.02;
    }

    int adjustment() {
        return 60000;
    }
}