package com.mathieupauly.intellijrefactoring;

public class MediumInsuranceStrategy extends InsuranceStrategy {
    @Override
    int constant() {
        return 35600;
    }

    @Override
    double weight() {
        return 0.2;
    }

    @Override
    int adjustment() {
        return 10000;
    }
}
