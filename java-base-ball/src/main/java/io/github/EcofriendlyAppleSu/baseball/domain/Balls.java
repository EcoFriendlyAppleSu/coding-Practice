package io.github.EcofriendlyAppleSu.baseball.domain;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private List<Ball> balls;

    private Balls(List<Integer> inputBalls) {
        this.balls = new ArrayList<>();
        for (Integer ball : inputBalls) {
            this.balls.add(Ball.of(ball, inputBalls.indexOf(ball)));
        }
    }

    public static Balls from(List<Integer> inputBalls) {
        return new Balls(inputBalls);
    }

    public List<Ball> currentBalls() {
        return this.balls;
    }

}
