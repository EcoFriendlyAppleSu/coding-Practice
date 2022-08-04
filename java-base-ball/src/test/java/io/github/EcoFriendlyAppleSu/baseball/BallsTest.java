package io.github.EcoFriendlyAppleSu.baseball;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class BallsTest {

    Balls computer = null;

    @BeforeEach
    void setUp() {
        computer = new Balls(Arrays.asList(1, 2, 9));
    }

    @Test
    public void nothingTest() throws Exception{
        Ball user = new Ball(4, 1);
        Assertions.assertThat(computer.playGame(user)).isEqualTo(BallStatus.NOTHING);
    }

    @Test
    public void ballTest() throws Exception{
        Ball user = new Ball(1, 1);
        Assertions.assertThat(computer.playGame(user)).isEqualTo(BallStatus.BALL);
    }

    @Test
    public void strikeTest() throws Exception{
        Ball user = new Ball(1, 0);
        Assertions.assertThat(computer.playGame(user)).isEqualTo(BallStatus.STRIKE);
    }
}
