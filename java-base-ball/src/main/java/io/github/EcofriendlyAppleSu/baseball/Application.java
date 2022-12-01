package io.github.EcofriendlyAppleSu.baseball;


import io.github.EcofriendlyAppleSu.baseball.util.WrongNumberException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    List<String> strings = List.of("1", "10", "30");
    System.out.println("strings.get(1) = " + strings.get(1));
    System.out.println(strings.size());
    System.out.println(strings.get(strings.size()-1));
  }
}
