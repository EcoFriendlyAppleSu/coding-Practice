package io.github.EcofriendlyAppleSu.baseball.util;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ValidationUtil {

    public static boolean validate(List<Integer> userBalls) {
        if (userBalls.size() != ConsoleOut.BALL_SIZE) return false;

        HashSet<Integer> ballSet = new HashSet<>(userBalls); // Without duplication
        if (ballSet.size() != ConsoleOut.BALL_SIZE) return false;

        int userMin = userBalls.stream().mapToInt(ball -> ball).min().orElse(-1);
        int userMax = userBalls.stream().mapToInt(ball -> ball).max().orElse(10);

        if (userMin < ConsoleOut.BALL_MIN_NUMBER || userMax > ConsoleOut.BALL_MAX_NUMBER) return false;

        return true;
    }
}
 