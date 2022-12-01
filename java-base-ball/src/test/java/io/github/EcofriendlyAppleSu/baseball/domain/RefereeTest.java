package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.util.GenerateNumber;
import io.github.EcofriendlyAppleSu.baseball.util.StringUtil;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RefereeTest {

    // Computer Balls Setting Using FunctionalInterface
    Computer computer = Computer.from(() -> Arrays.asList(1, 2, 3));

    @DisplayName("3개의 공이 모두 맞지 않았을 경우")
    @Test
    public void gameNothingBallsTest() throws Exception {
        Gamer gamer = Gamer.from("456");
        Referee referee = Referee.of(gamer, computer);
        GameReport gameReport = referee.matchBalls();
        assertThat(gameReport.getBall()).isEqualTo(0);
        assertThat(gameReport.getStrike()).isEqualTo(0);
    }

    @DisplayName("3개의 공이 모두 Strike일 경우")
    @Test
    public void gameStrikeBallsTest() throws Exception {
        Gamer gamer = Gamer.from("123");
        Referee referee = Referee.of(gamer, computer);
        GameReport gameReport = referee.matchBalls();
        assertThat(gameReport.isThreeStrike()).isTrue();
    }

    @DisplayName("3개의 공이 모두 Ball일 경우")
    @Test
    public void gameBallBallsTest() throws Exception {
        Gamer gamer = Gamer.from("312");
        Referee referee = Referee.of(gamer, computer);
        GameReport gameReport = referee.matchBalls();
        assertThat(gameReport.getBall()).isEqualTo(3);
    }

}
