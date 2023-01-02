package io.github.EcofriendlyAppleSu.baseball;

public class BallNumber {

  private Integer ballNumber;

  private BallNumber(Integer ballNumber) {
    if (ballNumber < 1 || ballNumber > 9) {
      throw new BallNumberOutOfBounds();
    }
    this.ballNumber = ballNumber;
  }

  public static BallNumber initBallNumber(int number) {
    return new BallNumber(number);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof BallNumber)) {
      return false;
    }

    BallNumber that = (BallNumber) o;

    return ballNumber != null ? ballNumber.equals(that.ballNumber) : that.ballNumber == null;
  }

  @Override
  public int hashCode() {
    return ballNumber != null ? ballNumber.hashCode() : 0;
  }
}
