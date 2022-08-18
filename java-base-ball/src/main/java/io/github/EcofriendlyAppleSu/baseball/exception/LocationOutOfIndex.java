package io.github.EcofriendlyAppleSu.baseball.exception;

public class LocationOutOfIndex extends IllegalArgumentException {
    public LocationOutOfIndex() {
    }

    public LocationOutOfIndex(String s) {
        super(s);
    }
}
