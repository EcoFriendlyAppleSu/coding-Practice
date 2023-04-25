package io.github.EcofriendlyAppleSu.baseball;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import io.github.EcofriendlyAppleSu.baseball.exception.BallNumberOutOfValueException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class BallNumberTest {

    @Test
    public void ballNumberTest() throws Exception {
        org.junit.jupiter.api.Assertions.assertDoesNotThrow(() -> BallNumber.from(5));
    }

    @DisplayName("공 숫자가 1~9가 아닐 때")
    @ParameterizedTest
    @ValueSource(ints = {0, 10})
    public void ballNumberOutOfValueTest(int ballNumber) throws Exception {
        assertThatThrownBy(() -> BallNumber.from(ballNumber)).isInstanceOf(BallNumberOutOfValueException.class);
    }

}
