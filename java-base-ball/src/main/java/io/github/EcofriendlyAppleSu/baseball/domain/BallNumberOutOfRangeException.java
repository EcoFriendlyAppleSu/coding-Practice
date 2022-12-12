package io.github.EcofriendlyAppleSu.baseball.domain;

public class BallNumberOutOfRangeException extends IllegalArgumentException {

  public BallNumberOutOfRangeException() {
    super();
  }

  public BallNumberOutOfRangeException(String s) {
    super(s);
  }
}
