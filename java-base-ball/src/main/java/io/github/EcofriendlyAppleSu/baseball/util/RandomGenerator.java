package io.github.EcofriendlyAppleSu.baseball.util;

public class RandomGenerator implements Generator {

    @Override
    public int generator() {
        return (int) (Math.random() * ConsoleOut.BALL_MAX_NUMBER )+ 1;
    }

}
