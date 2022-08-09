package io.github.EcoFriendlyAppleSu.baseball2.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RefereeTest {

    Referee referee = null;

    @BeforeEach
    void setUp() {
        referee = new Referee(Arrays.asList(1, 2, 3));
    }

    @DisplayName("Nothing Test")
    @Test
    public void nothingTest() throws Exception {
        Ball ball = new Ball(3, 9);
        assertThat(referee.gamePlay(ball)).isEqualTo(BallStatus.NOTHING);
    }

    @DisplayName("Ball Test")
    @Test
    public void ballTest() throws Exception{
        Ball ball = new Ball(3, 1);
        assertThat(referee.gamePlay(ball)).isEqualTo(BallStatus.BALL);
    }

    @DisplayName("Ball Test")
    @Test
    public void strikeTest() throws Exception{
        Ball ball = new Ball(1, 1);
        assertThat(referee.gamePlay(ball)).isEqualTo(BallStatus.STRIKE);
    }
}