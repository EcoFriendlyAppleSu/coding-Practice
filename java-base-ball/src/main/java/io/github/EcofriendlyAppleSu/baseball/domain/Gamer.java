package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.util.StringUtil;

import java.util.List;

public class Gamer implements Player {

    private Balls balls;

    private Gamer(List<Integer> inputBalls) {
        balls = Balls.from(inputBalls);
    }

    public static Gamer from(List<Integer> inputBalls) {
        return new Gamer(inputBalls);
    }

    @Override
    public List<Ball> currentBalls() {
        return balls.currentBalls();
    }
}
