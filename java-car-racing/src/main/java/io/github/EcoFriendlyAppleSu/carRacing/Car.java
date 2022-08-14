package io.github.EcoFriendlyAppleSu.carRacing;

import io.github.EcoFriendlyAppleSu.carRacing.Console.ConsoleOut;
import io.github.EcoFriendlyAppleSu.carRacing.exception.CarNameOutOfLength;
import io.github.EcoFriendlyAppleSu.carRacing.utils.MoveStrategy;

public class Car {

    private String name;
    private int position = 0;

    public Car(String name) {
        if (isOverCarLength(name)) {
            throw new CarNameOutOfLength(ConsoleOut.CAR_NAME_OUT_OF_RANGE_MESSAGE);
        }
        this.name = name;
    }

    // position의 값이 결과값으로 판단하는건가
    public int movePosition(MoveStrategy moveStrategy) {
        if (moveStrategy.canMove() >= ConsoleOut.RANDOM_RANGE) {
             position++;
        }
        return position;
    }

    public int currentPosition() {
        return position;
    }

    private boolean isOverCarLength(String name) {
        return name.length() > ConsoleOut.CAR_NAME_RANGE;
    }

    // RandomGenerateUtil과 협력이 필요한 메소드
    public void carMoving() {

    }
}
