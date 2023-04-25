package io.github.EcofriendlyAppleSu.baseball;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BallTest {

    private Ball standardBall;

    @BeforeEach
    void setUp() {
        standardBall = Ball.of(3, 1);
    }

    @Test
    public void ballStrikeTest() throws Exception {
        assertThat(standardBall.match(Ball.of(3, 1))).isEqualTo(BallStatus.STRIKE);
    }

    @Test
    public void ballNothingTest() throws Exception {
        assertThat(standardBall.match(Ball.of(5, 0))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    public void ballBallTest() throws Exception {
        assertThat(standardBall.match(Ball.of(3, 2))).isEqualTo(BallStatus.BALL);
    }
}
