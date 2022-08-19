package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOut;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOutMessage;

public class PlayResult {

    private int ball = 0;
    private int strike = 0;


    public void report(BallStatus ballStatus) {
        if (ballStatus.isStrike(ballStatus)) {
            strike++;
        }
        if (ballStatus.isBall(ballStatus)) {
            ball++;
        }
    }

    public void gameFinish() {
        if (strike == 3) {
            ConsoleOutMessage.GAME_FINISH_MESSAGE.print();
        }
    }

    public void print() {
        System.out.println(ball + " 볼" + strike + " 스트라이크");
    }
}
