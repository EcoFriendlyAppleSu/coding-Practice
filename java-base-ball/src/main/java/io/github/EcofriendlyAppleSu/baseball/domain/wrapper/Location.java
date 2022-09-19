package io.github.EcofriendlyAppleSu.baseball.domain.wrapper;

import io.github.EcofriendlyAppleSu.baseball.domain.exception.LocationOutOfRangeException;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOut;

public class Location {

    private int location;

    private Location(int location) {
        if (isNotLocation(location)) {
            throw new LocationOutOfRangeException(ConsoleOut.LOCATION_EXCEPTION_MESSAGE);
        }
        this.location = location;
    }

    public static Location from(int location) {
        return new Location(location);
    }

    private boolean isNotLocation(int location) {
        return location < ConsoleOut.LOCATION_MIN || location > ConsoleOut.LOCATION_MAX;
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
