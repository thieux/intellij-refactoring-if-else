package com.mathieupauly.intellijrefactoring;

public class IfElseDemo {

    public double calculateInsurance(double income) {
        double adjustement;
        double weight;
        double constant;
        if (income <= 10000) {
            adjustement = 0;
            weight = 0.365;
            constant = 0;
        } else if (income <= 30000) {
            adjustement = 10000;
            weight = 0.2;
            constant = 35600;
        } else if (income <= 60000) {
            adjustement = 30000;
            weight = 0.1;
            constant = 76500;
        } else {
            adjustement = 60000;
            weight = 0.02;
            constant = 105600;
        }
        return (income - adjustement) * weight + constant;
    }
}