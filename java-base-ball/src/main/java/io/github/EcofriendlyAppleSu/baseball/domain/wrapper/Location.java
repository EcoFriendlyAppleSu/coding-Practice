package io.github.EcofriendlyAppleSu.baseball.domain.wrapper;

import io.github.EcofriendlyAppleSu.baseball.domain.exception.LocationOutOfRangeException;

public class Location {

  private int location;

  private Location(int location) {
    if (location < 0 || location > 2) {
      throw new LocationOutOfRangeException("입력한 범위는 가질 수 없는 범위 입니다.");
    }
    this.location = location;
  }

  public static Location from(int location) {
    return new Location(location);
  }
}
