package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.util.GenerateNumber;

import java.util.List;

public class Computer implements Player {

    private Balls balls;
    private GenerateNumber generateNumber;

    private Computer(GenerateNumber generateNumber) {
        this.generateNumber = generateNumber;
        this.balls = Balls.from(generateBalls());
    }

    public static Computer from(GenerateNumber generateNumber) {
        return new Computer(generateNumber);
    }

    private List<Integer> generateBalls() {
        return this.generateNumber.generator();
    }

    @Override
    public List<Ball> currentBalls() {
        return balls.currentBalls();
    }
}
