package io.github.EcoFriendlyAppleSu.carRacing;

import io.github.EcoFriendlyAppleSu.carRacing.Console.ConsoleOut;
import io.github.EcoFriendlyAppleSu.carRacing.utils.RandomStrategy;
import io.github.EcoFriendlyAppleSu.carRacing.utils.StringSplitUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Cars {

    private List<Car> cars;
    private static int moveCarTime = 0;
    public Cars(String cars, int moveCarTime) {
        this.cars = new ArrayList<>();
        String[] strings = StringSplitUtil.modificationStringToNameStrings(cars);
        for (String eachCarName: strings) {
            this.cars.add(new Car(eachCarName));
        }
        this.moveCarTime = moveCarTime;
    }

//    public static void from(String cars, int moveTime) {
//        new Cars(cars);
//        moveCarTime = moveTime;
//    }

    private void carsMoving() {
        for (Car car : cars) {
            car.movePosition(new RandomStrategy());
            System.out.println(GameResult.eachGameResult(car));
        }
        System.out.println();
    }

    public void carsMovingTimes() {
        System.out.println(ConsoleOut.GAME_RESULT_MESSAGE);
        for (int i = 0; i < moveCarTime; i++) {
            carsMoving();
        }
    }

    public void findWinner() {
        ArrayList<String > result = new ArrayList<>();
        Car car = GameResult.winnerOfGame(cars);
        List<Car> collect = cars.stream().filter(x -> x.currentPosition() == car.currentPosition()).collect(Collectors.toList());
        collect.stream().map(x -> x.currentCarName()).forEach(System.out::print);
    }
}
