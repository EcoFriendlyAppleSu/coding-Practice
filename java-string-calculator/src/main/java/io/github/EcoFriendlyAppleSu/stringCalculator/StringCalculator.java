package io.github.EcoFriendlyAppleSu.stringCalculator;

import io.github.EcoFriendlyAppleSu.stringCalculator.exception.DivideZeroException;

public class StringCalculator {

    private int calculate(int firstValue, char operator, int secondValue) {
        if (operator == '+') {
            return add(firstValue, secondValue);
        }
        if (operator == '-') {
            return minus(firstValue, secondValue);
        }
        if (operator == '/') {
            return (int)divide(firstValue, secondValue);
        }
        if (operator == '*') {
            return multi(firstValue, secondValue);
        }
        throw new RuntimeException();
    }

    private int calculateSeparateString(String[] str) {
        int result = StringUtils.ToInt(str[0]);

        for (int i = 0; i < str.length - 2; i += 2) {
            result = calculate(result, str[i + 1].charAt(0), StringUtils.ToInt(str[i + 2]));
        }
        return result;
    }

    public boolean isBlank(String input) {
        if (input.equals(" ") || input == null) {
            return true;
        }
        return false;
    }

    public int makeResult(String input) {
        if (isBlank(input))
            throw new RuntimeException();
        return calculateSeparateString(StringUtils.separator(input));
    }


    public int add(int number1, int number2) {
        return number1 + number2;
    }

    public int minus(int number1, int number2) {
        return number1 - number2;
    }

    public int multi(int number1, int number2) {
        return number1 * number2;
    }

    public double divide(int number1, int number2) {
        if (number2 == 0) {
            throw new DivideZeroException();
        }
        return number1 / number2;
    }
}
