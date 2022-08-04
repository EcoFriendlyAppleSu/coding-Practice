package io.github.EcoFriendlyAppleSu.baseball;

import java.util.ArrayList;
import java.util.List;

/*
* Role : 공들의 위치과 값을 비교하는 역할
* Responsibility : 공들의 비교값을 결과로 출력한다.
* Collaboration : playResult와 협력한다.
*/
public class Balls {

    private List<Ball> answer;
    public Balls(List<Integer> balls) {
        answer = new ArrayList<>();
        settingComputerBalls(balls);
    }

    public BallStatus playGame(Ball user) {
        for (Ball eachBall : answer) {
            if (user.matchBall(eachBall) == BallStatus.STRIKE) {
                return BallStatus.STRIKE;
            }
            if (user.matchBall(eachBall) == BallStatus.BALL) {
                return BallStatus.BALL;
            }
        }
        return BallStatus.NOTHING;
    }

    public PlayResult play(List<Integer> userBall) {
        Balls userBalls = new Balls(userBall);
        PlayResult result = new PlayResult();
        for (Ball eachBall : answer) {
            BallStatus status = userBalls.playGame(eachBall);
            result.report(status);
        }
        return result;
    }

    /*
    * Using Stream
    * */
    public BallStatus play(Ball userBall) {
        return answer.stream()
                .map(game -> game.matchBall(userBall))
                .filter(BallStatus::isNotNothing)
                .findFirst()
                .orElse(BallStatus.NOTHING);
    }

    private void settingComputerBalls(List<Integer> balls) {
        for (int i = 0; i < balls.size(); i++) {
            this.answer.add(new Ball(balls.get(i), i));
        }
    }

    public void printBall() {
        for (Ball eachBall :
                answer) {
            System.out.println(eachBall.toString());
        }
    }
}
