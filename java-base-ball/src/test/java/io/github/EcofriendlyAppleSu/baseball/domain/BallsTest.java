package io.github.EcofriendlyAppleSu.baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

class BallsTest {

    List<Integer> inputBalls = Arrays.asList(1, 2, 3);
    
    @Test
    public void ballsInitTest() throws Exception {
        assertThatCode(() -> Balls.from(inputBalls)).doesNotThrowAnyException();
    }

    @DisplayName("Balls Contain Ball Test, Success")
    @Test
    public void ballsContainBallTest() throws Exception {
        //given
        Ball givenBall = Ball.of(1, 0);

        //when
        List<Ball> ballsList = Balls.from(inputBalls).currentBalls();

        //then
        assertThat(ballsList.contains(givenBall)).isTrue();
    }

    @DisplayName("Balls Contain Ball Test, Fail")
    @Test
    public void ballsDoesNotContainBallTest() throws Exception {
        //given
        Ball givenBall = Ball.of(9, 0);

        //when
        List<Ball> ballsList = Balls.from(inputBalls).currentBalls();

        //then
        assertThat(ballsList.contains(givenBall)).isFalse();
    }

}
