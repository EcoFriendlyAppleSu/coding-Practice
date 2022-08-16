package io.github.EcoFriendlyAppleSu.baseball2.util;

import io.github.EcoFriendlyAppleSu.baseball2.exception.UserInputOutOfBounds;

import java.util.List;
import java.util.Scanner;

public class ConsoleInput {

    private Scanner scanner = new Scanner(System.in);
    private static final int MAX_LENGTH = 3;

    public ConsoleInput() {
    }

    public List<Integer> scannerNextLine() {
        return StringUtil.stringToIntegerList(userInputNumber(scanner.nextLine()));
    }

    public String userInputNumber(String userInput) {
        if (isInnerBoundaryLength(userInput)) {
            throw new UserInputOutOfBounds(ConsoleOutput.USER_INPUT_OUT_OF_MESSAGE);
        }
        return userInput;
    }

    private boolean isInnerBoundaryLength(String userInput) {
        return userInput.length() != MAX_LENGTH;
    }
}
