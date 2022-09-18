package io.github.EcofriendlyAppleSu.baseball.domain.exception;

public class BallNumberOutOfRangeException extends IllegalArgumentException {
    public BallNumberOutOfRangeException() {
        super();
    }

    public BallNumberOutOfRangeException(String s) {
        super(s);
    }
}
