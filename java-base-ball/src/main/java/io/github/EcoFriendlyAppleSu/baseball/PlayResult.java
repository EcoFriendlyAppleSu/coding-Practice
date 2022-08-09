package io.github.EcoFriendlyAppleSu.baseball;

// 누구와 협력이 필요할까?
public class PlayResult {

    private int strike = 0;
    private int ball = 0;

    public int getStrike() {
        return strike;
    }

    public int getBall() {
        return ball;
    }

    public void report(BallStatus status) {
        if (status.isStrike()) {
            strike += 1;
        }
        if (status.isBall()) {
            ball += 1;
        }
    }

    public boolean isGameEnd() {
        System.out.println("3 STRIKE!");
        return this.strike == 3;
    }

    public void clear() {
        strike = 0;
        ball = 0;
    }

    @Override
    public String toString() {
        return "Strike = " + strike +
                ", ball = "  + ball;
    }
}