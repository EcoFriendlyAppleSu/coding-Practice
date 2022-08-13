package io.github.EcoFriendlyAppleSu.carRacing.utils;

import io.github.EcoFriendlyAppleSu.carRacing.Console.ConsoleIn;
import io.github.EcoFriendlyAppleSu.carRacing.Console.ConsoleOut;

import java.util.Random;

public class RandomGenerateUtil {

    private Random random = new Random();
    public int generate() {
        if (isNotMove()) {
            return ConsoleOut.NOT_MOVE;
        }
        return ConsoleOut.MOVE_FRONT;
    }

    private boolean isNotMove() {
        return random.nextInt(ConsoleOut.RANDOM_GENERATE_BOUND) < ConsoleOut.RANDOM_RANGE;
    }

}
