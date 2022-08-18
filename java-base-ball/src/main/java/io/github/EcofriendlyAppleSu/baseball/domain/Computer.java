package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOut;
import io.github.EcofriendlyAppleSu.baseball.util.Generator;
import io.github.EcofriendlyAppleSu.baseball.util.RandomGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Computer {

    public Balls generateThreeBall(Generator generator) {
        return Balls.of(extractBallNumbers(generator));
    }

    private List<Integer> extractBallNumbers(Generator generator) {

        List<Integer> tempBallContainer = new ArrayList<>();
        boolean flag = false;

        while (true) {
            int randomNumber = generator.generator();
            if (tempBallContainer.contains(randomNumber)) {
                continue;
            }
            tempBallContainer.add(randomNumber);
            if (tempBallContainer.size() == ConsoleOut.BALL_SIZE) {
                break;
            }
        }
        return tempBallContainer;
    }
}
