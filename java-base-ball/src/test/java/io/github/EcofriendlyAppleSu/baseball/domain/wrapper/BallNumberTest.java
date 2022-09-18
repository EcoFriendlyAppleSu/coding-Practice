package io.github.EcofriendlyAppleSu.baseball.domain.wrapper;

import io.github.EcofriendlyAppleSu.baseball.domain.exception.BallNumberOutOfRangeException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BallNumberTest {

    @Test
    public void ballNumberInnerBoundaryTest() throws Exception {
        assertThat(BallNumber.from(5)).isEqualTo(BallNumber.from(5));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 10})
    public void ballNumberExceptionTest(int inputNumber) throws Exception {
        assertThatThrownBy(() -> BallNumber.from(inputNumber)).isInstanceOf(BallNumberOutOfRangeException.class);
    }
}
