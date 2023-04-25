package io.github.EcofriendlyAppleSu.baseball;

import io.github.EcofriendlyAppleSu.baseball.exception.LocationValueOutOfIndexException;

public class Location {

    private int location;

    private Location(int location) {
        this.location = location;
    }

    public static Location from(int location) {
        if (location < 0 || location > 2) {
            throw new LocationValueOutOfIndexException();
        }
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

        return location == location1.location;
    }

    @Override
    public int hashCode() {
        return location;
    }
}
