package io.github.EcofriendlyAppleSu.baseball.domain.wrapper;

import io.github.EcofriendlyAppleSu.baseball.domain.exception.BallNumberOutOfRangeException;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOut;

public class BallNumber {

    private int ballNumber;

    private BallNumber(int ballNumber) {
        if (isNotBallNumber(ballNumber)) {
            throw new BallNumberOutOfRangeException(ConsoleOut.BALL_NUMBER_EXCEPTION_MESSAGE);
        }
        this.ballNumber = ballNumber;
    }

    public static BallNumber from(int ballNumber) {
        return new BallNumber(ballNumber);
    }

    private boolean isNotBallNumber(int ballNumber) {
        return ballNumber < ConsoleOut.BALL_NUMBER_MIX || ballNumber > ConsoleOut.BALL_NUMBER_MAX;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BallNumber)) return false;

        BallNumber that = (BallNumber) o;

        return ballNumber == that.ballNumber;
    }

    @Override
    public int hashCode() {
        return ballNumber;
    }
}
