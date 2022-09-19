package io.github.EcofriendlyAppleSu.baseball.domain;

import java.util.List;

public class Referee {

    private List<Ball> gamerBalls;
    private List<Ball> computerBalls;

    private Referee(Player computer, Player gamer) {
        computerBalls = computer.currentBalls();
        gamerBalls = gamer.currentBalls();
    }

    public static Referee of(Player gamer, Player computer) {
        return new Referee(computer, gamer);
    }

    public void matchBalls() {
        for (Ball gamerBall : gamerBalls) {
            for (Ball computerBall : computerBalls) {
                BallStatus eachBallResult = computerBall.matchBall(gamerBall);
            }
        }
    }

}
