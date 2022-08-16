package io.github.EcoFriendlyAppleSu.baseball.wrapper;

import io.github.EcoFriendlyAppleSu.baseball.exception.BallNumberOutOfRangeException;
import io.github.EcoFriendlyAppleSu.baseball.wrapper.BallNumber;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


/*
* 생성자를 만들 때부터 예외를 잡으려고 만든 것이니 예외 처리만든 기능이 추가되었을 때 지워야하나?
* */
public class BallNumberTest {

//    @DisplayName("Number Out Of Range Test")
//    @Test
//    public void ballNumberOutOfRangeTest() throws Exception {
//        BallNumber ball = new BallNumber(10);
//        assertThat(ball.checkNumber()).isFalse();
//    }

    @DisplayName("Number inner Range Test")
    @ParameterizedTest
    @ValueSource(ints = {1,9})
    public void ballNumberInnerRangeTest(int input) throws Exception {
        BallNumber ball = new BallNumber(input);
        assertThat(ball.checkNumber()).isTrue();
    }

    @ParameterizedTest
    @ValueSource(ints = {0,10})
    public void ballNumberOutOfRangeExceptionOccurTest(int input) throws Exception{
        assertThatThrownBy(() -> new BallNumber(input))
                .isInstanceOf(BallNumberOutOfRangeException.class)
                .hasMessageContaining("볼 숫자는 1부터 9의 값이어야 합니다.");
    }
}
