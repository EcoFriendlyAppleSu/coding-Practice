package io.github.EcoFriendlyAppleSu.baseball2.Wrapper;

import io.github.EcoFriendlyAppleSu.baseball2.exception.BallNumberOutOfIndex;
import io.github.EcoFriendlyAppleSu.baseball2.util.ConsoleOutput;

public class BallNumber {

    private final static int MAX_NUMBER = 9;
    private final static int MIN_NUMBER = 1;
    private int ballNumber;


    public BallNumber(int ballNumber) {
        this.ballNumber = ballNumber;
        if (isInnerRange(ballNumber)) {
                throw new BallNumberOutOfIndex(ConsoleOutput.BALL_NUMBER_EXCEPTION);
        }
        this.ballNumber = ballNumber;
    }

    private boolean isInnerRange(int ballNumber) {
        return ballNumber < MIN_NUMBER || ballNumber > MAX_NUMBER;
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

