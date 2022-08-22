package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.util.Generator;
import io.github.EcofriendlyAppleSu.baseball.util.ValidationUtil;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


// Stream을 사용하는 더 좋은 방법이 있을텐데..
// 책임, 메소드를 나누는 이야기를 하면 좋을 것 같다
public class Computer {

    public Balls generateThreeBall(Generator generator) {
        return Balls.of(extractBallNumbers(generator));
    }

    private List<Integer> extractBallNumbers(Generator generator) {
        List<Integer> generatedBallCollection = null;
        while (true) {
            generatedBallCollection = getBalls(generator);
            boolean validate = ValidationUtil.validate(generatedBallCollection);
            if (isValidateThreeNumber(validate)) {
                break;
            }
        }

        System.out.println(generatedBallCollection);
        return generatedBallCollection;
    }

    private boolean isValidateThreeNumber(boolean validate) {
        return validate == true;
    }

    private List<Integer> getBalls(Generator generator) {
        return IntStream.range(0, 3).map(x -> generator.generator()).distinct().boxed().collect(Collectors.toList());
    }


}
