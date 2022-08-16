package io.github.EcoFriendlyAppleSu.baseball.exception;

public class LocationOutOfRangeException extends IndexOutOfBoundsException {
    public LocationOutOfRangeException() {
    }

    public LocationOutOfRangeException(String s) {
        super(s);
    }
}
