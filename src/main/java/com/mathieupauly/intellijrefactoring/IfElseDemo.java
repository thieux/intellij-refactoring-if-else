package com.mathieupauly.intellijrefactoring;

public class IfElseDemo {

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            double adjustement = 0;
            double weight = 0.365;
            double constant = 0;
            return (income - adjustement) * weight + constant;
        } else if (income <= 30000) {
            final int adjustement = 10000;
            final double weight = 0.2;
            final int constant = 35600;
            return (income - adjustement) * weight + constant;
        } else if (income <= 60000) {
            final int adjustement = 30000;
            final double weight = 0.1;
            final int constant = 76500;
            return (income - adjustement) * weight + constant;
        } else {
            final int adjustement = 60000;
            final double weight = 0.02;
            final int constant = 105600;
            return (income - adjustement) * weight + constant;
        }
    }
}