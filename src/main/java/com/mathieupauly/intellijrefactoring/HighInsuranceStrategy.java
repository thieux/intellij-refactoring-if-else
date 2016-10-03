package com.mathieupauly.intellijrefactoring;

public class HighInsuranceStrategy extends InsuranceStrategy {
    @Override
    int constant() {
        return 76500;
    }

    @Override
    double weight() {
        return 0.1;
    }

    @Override
    int adjustment() {
        return 30000;
    }
}
