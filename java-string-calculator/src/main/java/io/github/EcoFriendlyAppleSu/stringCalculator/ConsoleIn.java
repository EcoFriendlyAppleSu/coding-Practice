package io.github.EcoFriendlyAppleSu.stringCalculator;

import java.util.Scanner;

public class ConsoleIn {

    private static Scanner scanner = new Scanner(System.in);

    public static String UserInput() {
        return scanner.nextLine();
    }
}
