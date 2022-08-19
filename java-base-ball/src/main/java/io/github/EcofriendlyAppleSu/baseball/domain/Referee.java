package io.github.EcofriendlyAppleSu.baseball.domain;

import java.util.List;

public class Referee {

    private static Balls userBalls;
    private static Balls computerBalls;

    private Referee(Balls userBalls, Balls computerBalls) {
        this.computerBalls = computerBalls;
    }

    public static Referee from(Balls userBalls, Balls computerBalls) {
        return new Referee(userBalls, computerBalls);
    }

    public static PlayResult play() {
        PlayResult playResult = new PlayResult();
        List<Ball> computer = computerBalls.currentBalls();
        List<Ball> user = userBalls.currentBalls();
        return playResult;
    }
}
