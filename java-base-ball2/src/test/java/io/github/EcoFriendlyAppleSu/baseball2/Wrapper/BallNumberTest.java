package io.github.EcoFriendlyAppleSu.baseball2.Wrapper;

import io.github.EcoFriendlyAppleSu.baseball2.exception.BallNumberOutOfIndex;
import io.github.EcoFriendlyAppleSu.baseball2.util.ConsoleOutput;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BallNumberTest {

    @DisplayName("공이 범위 안에 있을 경우")
    @ParameterizedTest
    @ValueSource(ints = {1,2,3,6,9})
    public void ballNumberInnerBoundary(int input) throws Exception {
        assertThatCode(() -> new BallNumber(input)).doesNotThrowAnyException();
    }

    @DisplayName("공이 범위 밖에 있을 경우")
    @ParameterizedTest
    @ValueSource(ints = {0, 10})
    public void ballNumberOutOfBoundary(int input) throws Exception {
        assertThatThrownBy(() -> new BallNumber(input))
                .isInstanceOf(BallNumberOutOfIndex.class)
                .hasMessageContaining(ConsoleOutput.BALL_NUMBER_EXCEPTION);
    }

}