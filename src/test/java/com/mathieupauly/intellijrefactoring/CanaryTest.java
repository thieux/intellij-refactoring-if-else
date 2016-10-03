package com.mathieupauly.intellijrefactoring;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class CanaryTest {
    @Test
    public void test() {
        Assertions.assertThat(1).isEqualTo(1);
    }

}