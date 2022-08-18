package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.exception.BallNumberOutOfRange;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOut;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOutMessage;

public class BallNumber {
    private int number;

    public BallNumber(int number) {
        if (number < ConsoleOut.BALL_MIN_NUMBER || number > ConsoleOut.BALL_MAX_NUMBER) {
            throw new BallNumberOutOfRange(ConsoleOutMessage.BALL_NUMBER_OUT_OF_RANGE_MESSAGE.message);
        }
        this.number = number;
    }
}
