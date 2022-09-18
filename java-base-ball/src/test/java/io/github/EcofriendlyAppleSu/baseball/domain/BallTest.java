package io.github.EcofriendlyAppleSu.baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    Ball gameBall = null;

    @BeforeEach
    void setUp() {
        gameBall = Ball.of(3, 1);
    }

    @Test
    public void ballInitTest() throws Exception {
        assertThat(gameBall).isEqualTo(Ball.of(3, 1));
    }

    @Test
    public void ballStrikeTest() throws Exception {
        Ball userBall = Ball.of(3, 1);
        assertThat(gameBall.matchBall(userBall)).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    public void ballBallTest() throws Exception {
        Ball userBall = Ball.of(3, 0);
        assertThat(gameBall.matchBall(userBall)).isEqualTo(BallStatus.BALL);
    }

    @Test
    public void ballNothingTest() throws Exception {
        Ball userBall = Ball.of(1, 0);
        assertThat(gameBall.matchBall(userBall)).isEqualTo(BallStatus.NOTHING);
    }
}
