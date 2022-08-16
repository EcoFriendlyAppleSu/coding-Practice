package io.github.EcoFriendlyAppleSu.baseball2.domain;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BallTest {

    Ball com = null;

    @BeforeEach
    void setUp() {
        com = new Ball(1, 9);
    }

    @DisplayName("Ball Nothing Case Test")
    @Test
    public void nothingTest() throws Exception {
        assertThat(com.matchTheBall(new Ball(2, 3))).isEqualTo(BallStatus.NOTHING);
    }

    @DisplayName("Ball Ball Case Test")
    @Test
    public void BallTest() throws Exception {
        assertThat(com.matchTheBall(new Ball(2, 9))).isEqualTo(BallStatus.BALL);
    }

    @DisplayName("Ball Strike Case Test")
    @Test
    public void StrikeTest() throws Exception {
        assertThat(com.matchTheBall(new Ball(1, 9))).isEqualTo(BallStatus.STRIKE);
    }

    @AfterEach
    void tearDown() {
        com = null;
    }
}