package io.github.EcofriendlyAppleSu.baseball.domain.wrapper;

import io.github.EcofriendlyAppleSu.baseball.domain.exception.BallNumberOutOfRangeException;

public class BallNumber {

  private int ballNumber;

  private BallNumber(int ballNumber) {
    if (ballNumber < 1 || ballNumber > 9) {
      throw new BallNumberOutOfRangeException("입력한 공 숫자는 범위를 넘었습니다.");
    }
    this.ballNumber = ballNumber;
  }

  public static BallNumber from(int ballNumber) {
    return new BallNumber(ballNumber);
  }
}
