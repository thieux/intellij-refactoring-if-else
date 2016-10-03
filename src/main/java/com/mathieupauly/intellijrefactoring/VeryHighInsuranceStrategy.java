package com.mathieupauly.intellijrefactoring;

public class VeryHighInsuranceStrategy extends InsuranceStrategy {
    public VeryHighInsuranceStrategy() {
    }

    @Override
    int constant() {
        return 105600;
    }

    @Override
    double weight() {
        return 0.02;
    }

    @Override
    int adjustment() {
        return 60000;
    }
}