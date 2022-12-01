package io.github.EcofriendlyAppleSu.baseball.domain;

public class GameReport {

    private int strike;
    private int ball;

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public void report(BallStatus status) {
        if (status.isStrike()) {
            this.strike += 1;
        }
        if (status.isBall()) {
            this.ball += 1;
        }
    }

    public boolean isThreeStrike() {
        return this.strike == 3;
    }

    public void printStrikeBallCount() {
        System.out.println(ball + " 볼 " + strike + " 스트라이크");
    }
}
