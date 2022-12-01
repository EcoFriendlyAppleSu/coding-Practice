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

    public GameReport matchBalls() {
        GameReport gameReport = new GameReport();
        for (Ball gamerBall : gamerBalls) {
            BallStatus ballStatus = ballsMatching(gamerBall);
            gameReport.report(ballStatus);
        }
        return gameReport;
    }

    private BallStatus ballsMatching(Ball gamerBall) {
        return computerBalls.stream()
                .map(computerBall -> computerBall.matchBall(gamerBall))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

}
