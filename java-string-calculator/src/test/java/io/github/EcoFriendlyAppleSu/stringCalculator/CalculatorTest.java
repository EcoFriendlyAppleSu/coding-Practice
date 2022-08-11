package io.github.EcoFriendlyAppleSu.stringCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    Calculator calculator = null;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @DisplayName("0 일 때 Test")
    @Test
    public void zeroStringTest() throws Exception {
        assertThat(calculator.init("")).isEqualTo(0);
    }

    @DisplayName("null 일 때 Test")
    @Test
    public void nullStringTest() throws Exception {
        assertThat(calculator.init(null)).isEqualTo(0);
    }
}
