package io.github.EcofriendlyAppleSu.baseball;

import io.github.EcofriendlyAppleSu.baseball.domain.enums.BallStatus;

public class Report {

  private int ball = 0;
  private int strike = 0;

  public void countBall(BallStatus ballStatus) {
    if (ballStatus.isBall(ballStatus)) {
      ball += 1;
    }
    if (ballStatus.isStrike(ballStatus)) {
      strike += 1;
    }
  }

  public void startOtherGame() {
    this.ball = 0;
    this.strike = 0;
  }

  public int currentBallCount() {
    return ball;
  }

  public int currentStrikeCount() {
    return strike;
  }

}
