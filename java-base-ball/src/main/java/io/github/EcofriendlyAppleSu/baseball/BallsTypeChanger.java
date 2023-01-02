package io.github.EcofriendlyAppleSu.baseball;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class BallsTypeChanger implements Changer{

  public static List<Integer> changer(String givenBalls) {
    String[] splitedBalls = givenBalls.split("");
    return Arrays.stream(splitedBalls).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
  }

  @Override
  public void changeType() {

  }
}
