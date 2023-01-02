package io.github.EcofriendlyAppleSu.baseball;


public class Ball {

  private BallNumber ballNumber;
  private Location location;

  private Ball(Integer ballNumber, Integer location) {
    this.ballNumber = BallNumber.initBallNumber(ballNumber);
    this.location = Location.initLocation(location);
  }

  public static Ball initBall(Integer ballNumber, Integer location) {
    return new Ball(ballNumber, location);
  }

  public BallStatus match(Ball givenBall) {
    if (this.equals(givenBall)) {
      return BallStatus.STRIKE;
    }
    if (this.ballNumber.equals(givenBall.ballNumber)) {
      return BallStatus.BALL;
    }
    return BallStatus.NOTHING;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Ball)) {
      return false;
    }

    Ball ball = (Ball) o;

    if (ballNumber != null ? !ballNumber.equals(ball.ballNumber) : ball.ballNumber != null) {
      return false;
    }
    return location != null ? location.equals(ball.location) : ball.location == null;
  }

  @Override
  public int hashCode() {
    int result = ballNumber != null ? ballNumber.hashCode() : 0;
    result = 31 * result + (location != null ? location.hashCode() : 0);
    return result;
  }
}
