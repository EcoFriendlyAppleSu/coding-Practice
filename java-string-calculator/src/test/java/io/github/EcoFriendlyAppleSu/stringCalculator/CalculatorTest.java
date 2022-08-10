package io.github.EcoFriendlyAppleSu.stringCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = null;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @DisplayName("빈 문자열 또는 null 값 입력 시 Test")
    @Test
    public void emptyStringTest() throws Exception {
        String text = "";
        String nullText = null;
        assertThat(calculator.init(text)).isEqualTo(0);
        assertThat(calculator.init(nullText)).isEqualTo(0);
    }

    @DisplayName("문자열의 길이가 1일 경우 Test")
    @ParameterizedTest
    @ValueSource(strings = {"1", "2", "9"})
    public void oneStringTest(String input) throws Exception {
        assertThat(calculator.init(input)).isEqualTo(Integer.valueOf(input));
    }

    @DisplayName("문자열 안에 콤마가 있을 경우 Test")
    @ParameterizedTest
    @ValueSource(strings = {"1,2", "3,4", "5,7"})
    public void stringHasCommaTest(String input) throws Exception {
        String[] split = input.split(",");
        assertThat(calculator.init(input)).isEqualTo(Stream.of(split).mapToInt(Integer::valueOf).sum());
    }

    @DisplayName("문자열에 콤마와 콜론이 있을 경우 Test")
    @ParameterizedTest
    @ValueSource(strings = {"1,2:3", "6:5:6"})
    public void stringHasCommaColonTest(String input) throws Exception {
        String[] splitString = input.split(",|:");
        assertThat(calculator.init(input)).isEqualTo(Stream.of(splitString).mapToInt(Integer::valueOf).sum());
    }
}