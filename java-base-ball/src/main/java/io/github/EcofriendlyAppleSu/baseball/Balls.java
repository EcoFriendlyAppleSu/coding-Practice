package io.github.EcofriendlyAppleSu.baseball;

import java.util.ArrayList;
import java.util.List;

public class Balls {

  private List<Ball> balls;

  private Balls(String  balls) {
    this.balls = new ArrayList<>();
    List<Integer> changedBalls = BallsTypeChanger.changer(balls);// List<Integer>
    for (Integer changedBall : changedBalls) {
      this.balls.add(Ball.initBall(changedBall, changedBalls.indexOf(changedBall)));
    }
  }

  public static Balls initBalls(String givenBalls) { // string to list type integer
    return new Balls(givenBalls);
  }

  public void matchBalls(Balls givenBalls) {
    List<Ball> givenBallList = givenBalls.currentBalls();
    for (Ball ball : balls) {
      for (Ball givenBall : givenBallList) {
        BallStatus ballStatus = ball.match(givenBall);
      }
    }
  }

  public List<Ball> currentBalls() {
    return this.balls;
  }
}
