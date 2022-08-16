package io.github.EcoFriendlyAppleSu.carRacing.Console;

import java.util.Scanner;

public class ConsoleIn {

    private static final Scanner SCANNER = new Scanner(System.in);

    public String carNameInput() {
        return SCANNER.nextLine();
    }

    public int carMovingTime() {
        return SCANNER.nextInt();
    }
}
