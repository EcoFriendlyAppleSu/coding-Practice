package io.github.EcofriendlyAppleSu.baseball.domain;

import java.util.List;
import java.util.stream.Stream;

public class Referee {

    private static Balls userBalls;
    private static Balls computerBalls;

    private Referee(Balls userBalls, Balls computerBalls) {
        this.userBalls = userBalls;
        this.computerBalls = computerBalls;
    }

    public static Referee from(Balls userBalls, Balls computerBalls) {
        return new Referee(userBalls, computerBalls);
    }

    public PlayResult play() {
        PlayResult playResult = new PlayResult();

        List<Ball> computer = computerBalls.currentBalls();
        List<Ball> user = userBalls.currentBalls();
        for (Ball ball : user) {
            BallStatus ballStatus = eachBallPlayResult(computer, ball);
            playResult.report(ballStatus);
        }
        return playResult;
    }

    static BallStatus eachBallPlayResult(List<Ball> computer, Ball eachBall) {
        return computer.stream()
                .map(answer -> answer.matchEachBall(eachBall))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }


}
