package io.github.EcoFriendlyAppleSu.baseball;

import java.util.ArrayList;
import java.util.List;

/*
* Role : 컴퓨터 공과 유저 공 비교
* Responsibility : 결과 값을 BallStatus로 반환
* Collaboration : Ball과 협력
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

    private void settingComputerBalls(List<Integer> balls) {
        for (int i = 0; i < balls.size(); i++) {
            this.answer.add(new Ball(balls.get(i), i));
        }
    }
}
