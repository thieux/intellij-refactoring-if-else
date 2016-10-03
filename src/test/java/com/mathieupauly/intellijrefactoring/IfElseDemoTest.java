package com.mathieupauly.intellijrefactoring;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class IfElseDemoTest {
    @Test
    public void low() {
        final IfElseDemo demo = new IfElseDemo();

        assertThat(demo.calculateInsurance(5000.0)).isEqualTo(1825.0);
    }

    @Test
    public void medium() {
        final IfElseDemo demo = new IfElseDemo();

        assertThat(demo.calculateInsurance(20000.0)).isEqualTo(37600.0);
    }

    @Test
    public void high() {
        final IfElseDemo demo = new IfElseDemo();

        assertThat(demo.calculateInsurance(50000.0)).isEqualTo(78500.0);
    }

    @Test
    public void veryHigh() {
        final IfElseDemo demo = new IfElseDemo();

        assertThat(demo.calculateInsurance(90000.0)).isEqualTo(106200.0);
    }
}