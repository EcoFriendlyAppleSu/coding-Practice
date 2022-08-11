package io.github.EcoFriendlyAppleSu.stringCalculator;

public class Calculator {
    public int init(String text) {
        if (isNullOrZeroLengthString(text)) {
            return 0;
        }
        return 100;
    }

    private boolean isNullOrZeroLengthString(String text) {
        return text == "" || text == null;
    }
}
