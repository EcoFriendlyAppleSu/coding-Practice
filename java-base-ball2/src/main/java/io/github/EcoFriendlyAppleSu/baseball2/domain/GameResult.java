package io.github.EcoFriendlyAppleSu.baseball2.domain;

import io.github.EcoFriendlyAppleSu.baseball2.util.ConsoleOutput;

public class GameResult {

    private int ball = 0;
    private int strike = 0;

    public void clearBall() {
        ball = 0;
        strike = 0;
    }

    public void report(BallStatus result) {
        if (result.isStrike()) {
            strike += 1;
        }
        if (result.isBall()) {
            ball += 1;
        }
    }

    public boolean isGameEnd() {
        System.out.println(ConsoleOutput.THREE_STRIKE_GAME_OVER);
        return this.strike == 3;
    }

    @Override
    public String toString() {
        return "ball=" + ball +
                ", strike=" + strike;
    }
}
