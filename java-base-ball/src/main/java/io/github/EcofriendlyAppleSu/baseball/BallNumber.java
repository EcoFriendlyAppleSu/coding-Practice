package io.github.EcofriendlyAppleSu.baseball;

import io.github.EcofriendlyAppleSu.baseball.exception.BallNumberOutOfValueException;

public class BallNumber {

    private int number;

    private BallNumber(int number) {
        this.number = number;
    }

    public static BallNumber from(int number) {
        if (number < 1 || number > 9) {
            throw new BallNumberOutOfValueException();
        }
        return new BallNumber(number);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof BallNumber)) {
            return false;
        }

        BallNumber that = (BallNumber) o;

        return number == that.number;
    }

    @Override
    public int hashCode() {
        return number;
    }
}
