package io.github.EcoFriendlyAppleSu.baseball2.util;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class GenerateRandom {

    public List<Integer> generate() {
        return new Random().ints(1, 9)
                .distinct()
                .limit(3)
                .boxed()
                .collect(Collectors.toList());
    }
}
