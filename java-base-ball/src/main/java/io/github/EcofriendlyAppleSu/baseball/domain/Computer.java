package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.util.GenerateNumber;

import java.util.List;

public class Computer implements Player {

    private Balls balls;

    private Computer(List<Integer> inputBalls) {
        this.balls = Balls.from(inputBalls);
    }

    public static Computer from(List<Integer> inputBalls) {
        return new Computer(inputBalls);
    }

    @Override
    public List<Ball> currentBalls() {
        return balls.currentBalls();
    }
}
