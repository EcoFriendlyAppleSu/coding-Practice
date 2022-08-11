package io.github.EcoFriendlyAppleSu.stringCalculator;

import java.util.stream.Stream;

public class Calculator {

    private StringSeparator separator = new StringSeparator();
    public int init(String text) {
        if (isNullOrZeroLengthString(text)) {
            return 0;
        }
        if (isOneLength(text)) {
            return Integer.valueOf(text);
        }
        String[] separatedString = separator.deletionWithoutNumber(text);
        for (String eachString : separatedString) {
            if (eachString.contains("-")) {
                throw new RuntimeException();
            }
        }
        return Stream.of(separatedString).mapToInt(Integer::valueOf).sum();
    }

    private boolean isOneLength(String text) {
        return text.length() == Constant.LENGTH_SIZE_ONE;
    }

    private boolean isNullOrZeroLengthString(String text) {
        return text == "" || text == null;
    }
}
