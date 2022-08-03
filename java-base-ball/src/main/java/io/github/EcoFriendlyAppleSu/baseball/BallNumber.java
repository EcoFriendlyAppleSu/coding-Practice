package io.github.EcoFriendlyAppleSu.baseball;

import io.github.EcoFriendlyAppleSu.baseball.exception.BallNumberOutOfRangeException;

public class BallNumber {

    private static int MIN_NUMBER = 1;
    private static int MAX_NUMBER = 9;
    private int number;

    public BallNumber(int number) {
        if (number < MIN_NUMBER || number > MAX_NUMBER) {
            throw new BallNumberOutOfRangeException("볼 숫자는 1부터 9의 값이어야 합니다.");
        }
        this.number = number;
    }

    public boolean checkNumber() {
        if (isBallInnerRange()) {
            return true;
        }
        return false;
    }

    private boolean isBallInnerRange() {
        return number >= MIN_NUMBER || number <= MAX_NUMBER;
    }
}
