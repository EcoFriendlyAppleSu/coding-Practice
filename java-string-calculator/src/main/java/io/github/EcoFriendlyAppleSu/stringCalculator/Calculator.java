package io.github.EcoFriendlyAppleSu.stringCalculator;

public class Calculator {
    public int init(String text) {
        if (isNullOrEmptyString(text)) {
            return 0;
        }
        if (text.length() == 1) {
            return Integer.valueOf(text);
        }
        return 1;
    }

    private boolean isNullOrEmptyString(String text) {
        return text == null || text == "";
    }
}
