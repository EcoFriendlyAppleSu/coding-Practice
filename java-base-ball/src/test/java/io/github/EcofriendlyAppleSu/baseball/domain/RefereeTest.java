package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.util.GenerateNumber;
import io.github.EcofriendlyAppleSu.baseball.util.StringUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RefereeTest {

    // Computer Balls Setting Using FunctionalInterface
    Computer computer = Computer.from(() -> Arrays.asList(1, 2, 3));

    @Test
    public void gameNothingBallsTest() throws Exception {
        Gamer gamer = Gamer.from("456");
        List<Ball> balls = gamer.currentBalls();
    }

}
