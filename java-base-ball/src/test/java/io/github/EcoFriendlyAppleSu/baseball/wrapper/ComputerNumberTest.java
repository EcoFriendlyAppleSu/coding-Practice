package io.github.EcoFriendlyAppleSu.baseball.wrapper;

import io.github.EcoFriendlyAppleSu.baseball.exception.ComputerLengthOutOfRange;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class ComputerNumberTest {

    @DisplayName("문자열 길이가 3이 아닐 경우")
    @ParameterizedTest
    @ValueSource(strings = "1234")
    public void occurLengthExceptionTest(String input) throws Exception {
        assertThatThrownBy(() -> new ComputerNumber(input))
                .isInstanceOf(ComputerLengthOutOfRange.class)
                .hasMessageContaining("오직 3 자리 숫자만 가능합니다.");
    }

    @DisplayName("문자열 길이가 3일 경우")
    @ParameterizedTest
    @ValueSource(strings = "123")
    public void validCaseTest(String input) throws Exception {
        assertThatCode(() -> new ComputerNumber(input))
                .doesNotThrowAnyException();
    }

}