package com.mathieupauly.intellijrefactoring;

public class LowInsuranceStrategy extends InsuranceStrategy {
    @Override
    int constant() {
        return 0;
    }

    @Override
    double weight() {
        return 0.365;
    }

    @Override
    int adjustment() {
        return 0;
    }
}
