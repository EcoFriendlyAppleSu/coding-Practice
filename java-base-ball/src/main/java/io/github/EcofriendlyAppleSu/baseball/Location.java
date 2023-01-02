package io.github.EcofriendlyAppleSu.baseball;

public class Location {

  private Integer location;

  private Location(Integer location) {
    if (location < 0 || location > 2) {
      throw new LocationNumberOutOfBounds();
    }
    this.location = location;
  }

  public static Location initLocation(Integer location) {
    return new Location(location);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (!(o instanceof Location)) {
      return false;
    }

    Location location1 = (Location) o;

    return location != null ? location.equals(location1.location) : location1.location == null;
  }

  @Override
  public int hashCode() {
    return location != null ? location.hashCode() : 0;
  }
}
