package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.exception.BallNumberOutOfMessage;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOutMessage;

public class BallNumber {
    private int number;

    public BallNumber(int number) {
        if (number <= 0 || number > 9) {
            throw new BallNumberOutOfMessage(ConsoleOutMessage.BALL_NUMBER_OUT_OF_RANGE_MESSAGE.message);
        }
        this.number = number;
    }
}
