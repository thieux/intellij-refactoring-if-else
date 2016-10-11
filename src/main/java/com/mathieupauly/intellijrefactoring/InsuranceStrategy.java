package com.mathieupauly.intellijrefactoring;

public class InsuranceStrategy {
    private final int a;
    private final double w;
    private final int c;

    public InsuranceStrategy(int a, double w, int c) {
        this.a = a;
        this.w = w;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public double getW() {
        return w;
    }

    public int getC() {
        return c;
    }

    double andApplyItTo(double income) {
        return (income - getA()) * getW() + getC();
    }
}
