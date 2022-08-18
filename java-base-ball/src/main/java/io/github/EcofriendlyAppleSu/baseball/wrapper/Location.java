package io.github.EcofriendlyAppleSu.baseball.wrapper;

import io.github.EcofriendlyAppleSu.baseball.exception.LocationOutOfIndex;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOut;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOutMessage;

public class Location {
    private int position;

    public Location(int position) {
        if (isNotProperPosition(position)) {
            throw new LocationOutOfIndex(ConsoleOutMessage.LOCATION_OUT_OF_INDEX.message);
        }
        this.position = position;
    }

    private boolean isNotProperPosition(int position) {
        return position < ConsoleOut.LOCATION_MIN_NUMBER || position > ConsoleOut.LOCATION_MAX_NUMBER;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Location)) return false;

        Location location = (Location) o;

        return position == location.position;
    }

    @Override
    public int hashCode() {
        return position;
    }
}
