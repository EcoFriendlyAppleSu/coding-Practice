package io.github.EcofriendlyAppleSu.baseball;

public class LocationNumberOutOfBounds extends
    IllegalArgumentException {

  public LocationNumberOutOfBounds() {
  }

  public LocationNumberOutOfBounds(String s) {
    super(s);
  }
}
