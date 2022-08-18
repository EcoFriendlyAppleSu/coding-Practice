package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.exception.BallNumberOutOfRange;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;

class BallNumberTest {

    @Test
    public void numberInnerRangeTest() throws Exception {
        assertThatCode(() -> new BallNumber(5)).doesNotThrowAnyException();
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 10})
    public void numberOutOfRangeTest(int input) throws Exception {
        assertThatThrownBy(() -> new BallNumber(input))
                .isInstanceOf(BallNumberOutOfRange.class)
                .hasMessageContaining("1 부터 9 사이의 숫자를 입력해야 합니다.");

    }

}