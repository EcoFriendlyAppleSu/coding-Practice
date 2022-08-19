package io.github.EcofriendlyAppleSu.baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RefereeTest {

    Balls balls = null;

    @BeforeEach
    void setUp() {
        balls = Balls.of(Arrays.asList(1, 2, 3));
    }

    @Test
    public void nothingTest() throws Exception {
        List<Ball> com = balls.currentBalls();
        Ball eachBall = new Ball(2, 8);
        Assertions.assertThat(Referee.eachBallPlayResult(com, eachBall)).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    public void ballTest() throws Exception {
        List<Ball> com = balls.currentBalls();
        Ball eachBall = new Ball(2, 1);
        Assertions.assertThat(Referee.eachBallPlayResult(com, eachBall)).isEqualTo(BallStatus.BALL);
    }

    @Test
    public void strikeTest() throws Exception {
        List<Ball> com = balls.currentBalls();
        Ball eachBall = new Ball(2, 3);
        Assertions.assertThat(Referee.eachBallPlayResult(com, eachBall)).isEqualTo(BallStatus.STRIKE);
    }

}