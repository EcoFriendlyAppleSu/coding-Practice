package io.github.EcofriendlyAppleSu.baseball.domain.exception;

public class LocationOutOfRangeException extends IllegalArgumentException {

  public LocationOutOfRangeException() {
  }

  public LocationOutOfRangeException(String s) {
    super(s);
  }
}
