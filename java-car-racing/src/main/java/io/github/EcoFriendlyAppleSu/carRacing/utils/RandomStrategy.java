package io.github.EcoFriendlyAppleSu.carRacing.utils;


import io.github.EcoFriendlyAppleSu.carRacing.Console.ConsoleOut;

public class RandomStrategy implements MoveStrategy {

    @Override
    public int canMove() {
        return (int) (Math.random() * (ConsoleOut.RANDOM_GENERATE_BOUND));
    }
}
