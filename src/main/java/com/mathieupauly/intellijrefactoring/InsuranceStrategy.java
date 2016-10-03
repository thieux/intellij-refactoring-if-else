package com.mathieupauly.intellijrefactoring;

public abstract class InsuranceStrategy {
    double calculateVeryHighInsurance(double income) {
        return (income - adjustment()) * weight() + constant();
    }

    abstract int constant();

    abstract double weight();

    abstract int adjustment();
}
