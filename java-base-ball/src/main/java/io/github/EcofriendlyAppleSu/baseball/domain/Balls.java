package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOut;

import java.util.ArrayList;
import java.util.List;

public class Balls {

    private List<Ball> balls;

    private Balls(List<Integer> inputBallData) {
        balls = new ArrayList<>();
        for (int index = 0; index < ConsoleOut.BALL_SIZE; index++) {
            balls.add(new Ball(index, (int)inputBallData.get(index)));
        }
    }
    
    public static Balls of(List<Integer> ballData) {
        return new Balls(ballData);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Balls)) return false;

        Balls balls1 = (Balls) o;

        return balls != null ? balls.equals(balls1.balls) : balls1.balls == null;
    }

    @Override
    public int hashCode() {
        return balls != null ? balls.hashCode() : 0;
    }
}
