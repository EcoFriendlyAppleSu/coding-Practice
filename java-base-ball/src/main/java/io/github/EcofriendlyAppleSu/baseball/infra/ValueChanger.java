package io.github.EcofriendlyAppleSu.baseball.infra;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ValueChanger {

  public static List<Integer> run(String computerNumbers) {
    String[] splitedString = stringSplitor(computerNumbers);

    return Stream.of(splitedString).mapToInt(element -> Integer.parseInt(element)).boxed()
        .collect(Collectors.toList());
  }

  private static String[] stringSplitor(String computerNumbers) {
    return computerNumbers.split("");
  }

}
