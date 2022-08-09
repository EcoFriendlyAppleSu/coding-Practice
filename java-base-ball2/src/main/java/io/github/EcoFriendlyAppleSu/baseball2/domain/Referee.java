package io.github.EcoFriendlyAppleSu.baseball2.domain;

import java.util.ArrayList;
import java.util.List;

public class Referee {
    private List<Ball> ballList = null;

    public Referee(List<Integer> computerIn) {
        ballList = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ballList.add(new Ball(i + 1, computerIn.get(i)));
        }
    }

    public BallStatus gamePlay(Ball user) {
        return ballList.stream()
                .map(game -> game.matchTheBall(user))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    public GameResult printResultGame(List<Integer> userBalls) {
        GameResult gameResult = new GameResult();
        Referee userBall = new Referee(userBalls);
        for (Ball eachBall : userBall.ballList) {
            BallStatus result = gamePlay(eachBall);
            gameResult.report(result);
        }
        return gameResult;
    }
}
