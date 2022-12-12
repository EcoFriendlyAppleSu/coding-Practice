package io.github.EcofriendlyAppleSu.baseball.domain;

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
  public void matches(Balls givenBalls) {

  }

  public List<Ball> currentBalls() {
    return balls;
  }
}
