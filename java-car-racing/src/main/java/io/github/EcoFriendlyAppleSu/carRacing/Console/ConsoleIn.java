package io.github.EcoFriendlyAppleSu.carRacing.Console;

import java.util.Scanner;

public class ConsoleIn {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String carNameInput() {
        return SCANNER.nextLine();
    }

    public static int carMovingTime() {
        return SCANNER.nextInt();
    }
}
