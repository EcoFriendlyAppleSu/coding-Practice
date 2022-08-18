package io.github.EcofriendlyAppleSu.baseball.domain;

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
}
