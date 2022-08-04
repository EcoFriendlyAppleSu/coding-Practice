package io.github.EcoFriendlyAppleSu.baseball;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/*
* Role : 랜덤 숫자를 만드는 역할
* Responsibility : 3자리 문자열을 반환하는 책임
* Collaboration : ComputerNumber 객체와 협력, 굳이 할 필요가 있을까..,
*/
public class GenerateRandomNumber {

    private static int MIN_NUMBER = 1;
    private static int MAX_NUMBER = 9;
    private static int NUMBER_SIZE = 3;

    public static List<Integer> generateRandomNumber() {
        Random random = new Random();
        int result = 0;
        List<Integer> list = new ArrayList<>();
        for (; list.size() < NUMBER_SIZE; ) {
            result = random.nextInt((MAX_NUMBER - MIN_NUMBER) + 1) + MIN_NUMBER;
            if (list.contains(result)) {
                continue;
            }
            list.add(result);
        }
        return list.stream().map(Integer::valueOf).collect(Collectors.toList()); // return 568 ex.
    }

    public static String generateRandomNumberUsingStream() {
        return IntStream.rangeClosed(0, 2)
                .map(x -> new Random().nextInt(MAX_NUMBER) + MIN_NUMBER)
                .boxed()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
