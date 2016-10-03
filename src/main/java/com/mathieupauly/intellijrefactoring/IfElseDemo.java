package com.mathieupauly.intellijrefactoring;

public class IfElseDemo {

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            return income * 0.365;
        } else if (income <= 30000) {
            return (income - 10000) * 0.2 + 35600;
        } else if (income <= 60000) {
            return (income - 30000) * 0.1 + 76500;
        } else {
            return calculateVeryHighInsurance(income);
        }
    }

    private double calculateVeryHighInsurance(double income) {
        return (income - adjustment()) * weight() + constant();
    }

    private int constant() {
        return 105600;
    }

    private double weight() {
        return 0.02;
    }

    private int adjustment() {
        return 60000;
    }
}