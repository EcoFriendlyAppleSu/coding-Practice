package io.github.EcofriendlyAppleSu.baseball.infra;

import java.util.Scanner;

public class ConsoleIn {

  private static Scanner scanner = new Scanner(System.in);

  public static String gameBallNumberInput() {
    return scanner.nextLine();
  }

  public static String reStartInput() {
    return scanner.nextLine();
  }

}
