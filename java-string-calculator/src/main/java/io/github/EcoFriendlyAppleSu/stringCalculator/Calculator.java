package io.github.EcoFriendlyAppleSu.stringCalculator;

import java.util.stream.Stream;

public class Calculator {
    public int init(String text) {
        if (isNullOrEmptyString(text)) {
            return 0;
        }

        String[] splitString = stringSplit(text);

        if (splitString.length >= 2) {
            return Stream.of(splitString).mapToInt(Integer::valueOf).sum();
        }

        if (splitString.length == 1) {
            return Integer.valueOf(text);
        }

        return 1;
    }

    private boolean isNullOrEmptyString(String text) {
        return text == null || text == "";
    }

    private static String[] stringSplit(String text) {
        return text.split(",|:");
    }
}
