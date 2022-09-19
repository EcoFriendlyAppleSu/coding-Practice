package io.github.EcofriendlyAppleSu.baseball.domain;

public class GameReport {

    private int strike;
    private int ball;

    public void isStrike() {
        strike += 1;
    }

    public void isBall() {
        ball += 1;
    }

    public boolean isThreeStrike() {
        if (strike == 3) {
            return true;
        }
        return false;
    }

    public void printStrikeBallCount() {
        System.out.println(ball + " 볼 " + strike + " 스트라이크");
    }
}
