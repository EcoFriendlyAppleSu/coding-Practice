package io.github.EcofriendlyAppleSu.baseball.util;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class GenerateNumberImpl implements GenerateNumber {

    @Override
    public List<Integer> generator() {
        return new Random().ints(1, 10).distinct().limit(3).boxed().collect(Collectors.toList());
    }
}
