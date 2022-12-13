package io.github.EcofriendlyAppleSu.baseball.infra;

import io.github.EcofriendlyAppleSu.baseball.domain.RandomNumberGenerator;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RandomNumberGeneratorImpl implements RandomNumberGenerator {

  @Override
  public String generator() {
    Set<Integer> randomNumbers = new HashSet<>();
    Random random = new Random();

    for (; randomNumbers.size() < 3; ) {
      randomNumbers.add(random.nextInt(9) + 1);
    }
    return randomNumbers.stream().map(String::valueOf).collect(Collectors.joining());
  }
}
