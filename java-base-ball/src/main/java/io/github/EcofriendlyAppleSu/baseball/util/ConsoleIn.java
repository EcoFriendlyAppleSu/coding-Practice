package io.github.EcofriendlyAppleSu.baseball.util;

import java.util.Scanner;

public class ConsoleIn {

    private static Scanner scanner = new Scanner(System.in);

    public static String userGameNumber() {
        return scanner.nextLine();
    }

    public static int userPlayAgainNumber() {
        return scanner.nextInt();
    }
}
