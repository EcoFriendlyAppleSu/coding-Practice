package io.github.EcoFriendlyAppleSu.baseball;

import io.github.EcoFriendlyAppleSu.baseball.exception.LocationOutOfRangeException;

public class Location {

    private static int MIN_LOCATION = 1;
    private static int MAX_LOCATION = 3;
    private int position;

    public Location(int position) {
        if (position < MIN_LOCATION || position > MAX_LOCATION) {
            throw new LocationOutOfRangeException("위치는 1부터 3 사이여야 합니다.");
        }
        this.position = position;
    }

    public boolean checkNumber() {
        if (isLocatable()) {
            return true;
        }
        return false;
    }

    private boolean isLocatable() {
        return position >= MIN_LOCATION && position <= MAX_LOCATION;
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
