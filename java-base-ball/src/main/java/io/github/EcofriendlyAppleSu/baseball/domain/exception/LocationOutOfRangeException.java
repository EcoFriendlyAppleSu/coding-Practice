package io.github.EcofriendlyAppleSu.baseball.domain.exception;

public class LocationOutOfRangeException extends IndexOutOfBoundsException {
    public LocationOutOfRangeException() {
        super();
    }

    public LocationOutOfRangeException(String s) {
        super(s);
    }
}
