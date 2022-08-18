package io.github.EcofriendlyAppleSu.baseball.exception;

public class BallNumberOutOfRange extends IllegalArgumentException {
    public BallNumberOutOfRange() {
    }

    public BallNumberOutOfRange(String s) {
        super(s);
    }
}
