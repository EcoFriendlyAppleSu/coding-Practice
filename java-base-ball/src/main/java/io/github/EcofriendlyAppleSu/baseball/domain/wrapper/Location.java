package io.github.EcofriendlyAppleSu.baseball.domain.wrapper;

import io.github.EcofriendlyAppleSu.baseball.domain.exception.LocationOutOfRangeException;

public class Location {

    private int location;

    private Location(int location) {
        if (location < 0 || location > 2) {
            throw new LocationOutOfRangeException();
        }
        this.location = location;
    }

    public static Location from(int location) {
        return new Location(location);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;

        Location location1 = (Location) o;

        return location == location1.location;
    }

    @Override
    public int hashCode() {
        return location;
    }
}
