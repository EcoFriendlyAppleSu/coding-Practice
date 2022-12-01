package io.github.EcofriendlyAppleSu.baseball.util;

import java.util.Scanner;

public class ConsoleIn {

    private static Scanner scanner = new Scanner(System.in);

    public static String userInput() {
        System.out.print(ConsoleOut.INPUT_NUMBER_MESSAGE);
        return scanner.nextLine();
    }

    public static String userGameAgain() {
        System.out.println(ConsoleOut.RESTART_GAME_MESSAGE);
        return scanner.nextLine();
    }
}
