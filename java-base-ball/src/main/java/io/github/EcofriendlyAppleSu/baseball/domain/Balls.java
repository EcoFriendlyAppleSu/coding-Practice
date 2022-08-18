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
}
