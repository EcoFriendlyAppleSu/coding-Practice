package io.github.EcoFriendlyAppleSu.baseball.exception;

public class BallNumberOutOfRangeException extends IndexOutOfBoundsException {
    public BallNumberOutOfRangeException() {
    }

    public BallNumberOutOfRangeException(String s) {
        super(s);
    }
}
