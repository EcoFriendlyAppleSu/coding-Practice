package io.github.EcofriendlyAppleSu.baseball.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    Ball com = null;

    @BeforeEach
    void setUp() {
        com = new Ball(1, 2);
    }

    @Test
    public void nothingTest() throws Exception {
        assertThat(com.matchEachBall(new Ball(2, 9))).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    public void ballTest() throws Exception {
        assertThat(com.matchEachBall(new Ball(2, 2))).isEqualTo(BallStatus.BALL);
    }

    @Test
    public void strikeTest() throws Exception {
        assertThat(com.matchEachBall(new Ball(1, 2))).isEqualTo(BallStatus.STRIKE);
    }
}