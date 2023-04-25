package io.github.EcofriendlyAppleSu.baseball.exception;

public class BallNumberOutOfValueException extends IllegalArgumentException {

    public BallNumberOutOfValueException() {
    }

    public BallNumberOutOfValueException(String message) {
        super(message);
    }
}
