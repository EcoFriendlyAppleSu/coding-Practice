package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.domain.wrapper.BallNumber;
import io.github.EcofriendlyAppleSu.baseball.domain.wrapper.Location;

public class Ball {

  private BallNumber ballNumber;
  private Location location;

  private Ball(int ballNumber, int location) {
    this.ballNumber = BallNumber.from(ballNumber);
    this.location = Location.from(location);
  }

  public static Ball of(int ballNumber, int location) {
    return new Ball(ballNumber, location);
  }
}
