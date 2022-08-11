package io.github.EcoFriendlyAppleSu.stringCalculator;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

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

    @DisplayName("숫자 하나 입력 할 때 Test")
    @ParameterizedTest
    @ValueSource(strings = {"1", "4", "9"})
    public void oneLengthStringTest(String input) throws Exception {
        assertThat(calculator.init(input)).isEqualTo(Integer.valueOf(input));
    }

    @DisplayName("String has comma Case Test")
    @ParameterizedTest
    @ValueSource(strings = {"1", "1,2", "3,4"})
    public void commaSepTest(String input) throws Exception {
        String[] strings = sepString(input);
        assertThat(calculator.init(input)).isEqualTo(Arrays.stream(strings).mapToInt(Integer::valueOf).sum());
    }

    @DisplayName("String has comma Case Test")
    @ParameterizedTest
    @ValueSource(strings = {"1:3","1,2:3","2,4"})
    public void commaAndColonSepTest(String input) throws Exception {
        String[] strings = sepString(input);
        assertThat(calculator.init(input)).isEqualTo(Stream.of(strings).mapToInt(Integer::valueOf).sum());
    }

    @DisplayName("특수 문자 제외 Test")
    @Test
    public void stringRegexTest() throws Exception {
        String str = "//;\n1;2;3";
        assertThat(calculator.init(str)).isEqualTo(6);
    }
    

    @ParameterizedTest
    @ValueSource(strings = {"-1", "-1,2,3"})
    public void stringMinusExceptionTest(String input) throws Exception {
        assertThatThrownBy(() -> calculator.init(input))
                .isInstanceOf(RuntimeException.class);
    }

    private String[] sepString(String input) {
        return input.split(",|:");
    }

}
