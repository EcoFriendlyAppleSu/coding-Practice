package io.github.EcofriendlyAppleSu.baseball.domain;

public enum BallStatus {
    BALL, STRIKE, NOTHING;

    public boolean isNotNothing() {
        return this != NOTHING;
    }

    public boolean isStrike(BallStatus ballStatus) {
        return STRIKE == ballStatus;
    }

    public boolean isBall(BallStatus ballStatus) {
        return BALL == ballStatus;
    }
}
