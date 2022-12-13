package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.Report;
import io.github.EcofriendlyAppleSu.baseball.domain.enums.BallStatus;
import java.util.ArrayList;
import java.util.List;

public class Balls {

  private List<Ball> balls;

  public Balls(List<Integer> givenBalls) {
    balls = new ArrayList<>();
    for (Integer givenBall : givenBalls) {
      balls.add(Ball.of(givenBall, givenBalls.indexOf(givenBall)));
    }
  }

  public static Balls from(List<Integer> balls) {
    return new Balls(balls);
  }

  // TODO: 2022/12/12 balls matching
  public Report matches(Balls givenBalls) {
    List<Ball> userBalls = givenBalls.currentBalls();
    Report report = new Report();
    for (Ball ball : balls) {
      for (Ball userBall : userBalls) {
        BallStatus ballResult = ball.matchBall(userBall);
        report.countBall(ballResult);
      }
    }
    return report;
  }

  public List<Ball> currentBalls() {
    return balls;
  }
}
