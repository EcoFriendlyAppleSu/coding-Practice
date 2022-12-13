package io.github.EcofriendlyAppleSu.baseball.domain.enums;

public enum BallStatus {

  STRIKE, NOTHING, BALL;

  public boolean isStrike(BallStatus ballStatus) {
    if (ballStatus.name().equals(STRIKE.name())) {
      return true;
    }
    return false;
  }

  public boolean isBall(BallStatus ballStatus) {
    if (ballStatus.name().equals(BALL.name())) {
      return true;
    }
    return false;
  }
}
