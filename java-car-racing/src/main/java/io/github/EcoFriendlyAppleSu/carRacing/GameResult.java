package io.github.EcoFriendlyAppleSu.carRacing;

import io.github.EcoFriendlyAppleSu.carRacing.Console.ConsoleOut;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GameResult {

    public static String eachGameResult(Car car) {
        // String repeat = ConsoleOut.GAME_RESULT_DASH.repeat(car.currentPosition());
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < car.currentPosition(); i++) {
            buffer.append(ConsoleOut.GAME_RESULT_DASH);
        }
        return car.currentCarName() + " : " + buffer.toString();
    }

    public static Car winnerOfGame(List<Car> cars) {
        return cars.stream().max(Comparator.comparing(Car::currentPosition)).orElseThrow(NoSuchElementException::new);
    }
}
