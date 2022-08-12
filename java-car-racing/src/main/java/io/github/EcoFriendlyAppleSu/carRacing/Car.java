package io.github.EcoFriendlyAppleSu.carRacing;

import io.github.EcoFriendlyAppleSu.carRacing.exception.CarNameOutOfLength;

public class Car {

    private String name;

    public Car(String name) {
        if (isOverCarLength(name)) {
            throw new CarNameOutOfLength(ConsoleOut.CAR_NAME_OUT_OF_RANGE_MESSAGE);
        }
        this.name = name;
    }

    private boolean isOverCarLength(String name) {
        return name.length() > ConsoleOut.CAR_NAME_RANGE;
    }
}
