package com.mathieupauly.intellijrefactoring;

public enum InsuranceStrategy {

    LOW(0, 0.365, 0),
    MEDIUM(10000, 0.2, 35600),
    HIGH(30000, 0.1, 76500),
    VERY_HIGH(60000, 0.02, 105600);

    private final int a;
    private final double w;
    private final int c;

    InsuranceStrategy(int a, double w, int c) {
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
