package io.github.EcofriendlyAppleSu.baseball.domain;

import java.util.List;

public class Referee {

    List<Ball> gamerBalls;
    List<Ball> computerBalls;

    private Referee(Player computer, Player gamer) {
        computerBalls = computer.currentBalls();
        gamerBalls = gamer.currentBalls();
    }

    public static Referee of(Player gamer, Player computer) {
        return new Referee(computer, gamer);
    }

    public void matchBalls() {

    }

}
