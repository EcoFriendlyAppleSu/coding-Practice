package io.github.EcofriendlyAppleSu.baseball.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserBall {

    public Balls createUserBall(String userInput) {
        return Balls.of(stringsToListInteger(stringSplit(userInput)));
    }

    String[] stringSplit(String str) {
        return str.split("");
    }

    List<Integer> stringsToListInteger(String[] strings) {
        return Stream.of(strings).mapToInt(Integer::valueOf).boxed().collect(Collectors.toList());
    }
}
