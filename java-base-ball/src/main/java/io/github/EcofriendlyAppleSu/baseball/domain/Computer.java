package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOut;
import io.github.EcofriendlyAppleSu.baseball.util.Generator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


// Stream을 사용하는 더 좋은 방법이 있을텐데..
// 책임, 메소드를 나누는 이야기를 하면 좋을 것 같다
public class Computer {

    public Balls generateThreeBall(Generator generator) {
        return Balls.of(extractBallNumbers(generator));
    }

    private List<Integer> extractBallNumbers(Generator generator) {

        List<Integer> tempBallContainer = new ArrayList<>();

        while (true) {
            int randomNumber = generator.generator();
            if (hasItContents(tempBallContainer, randomNumber)) {
                continue;
            }
            tempBallContainer.add(randomNumber);
            if (isSameSize(tempBallContainer)) {
                break;
            }
        }
        System.out.println(Arrays.asList(tempBallContainer));
        return tempBallContainer;
    }

    private boolean isSameSize(List<Integer> tempBallContainer) {
        return tempBallContainer.size() == ConsoleOut.BALL_SIZE;
    }

    private boolean hasItContents(List<Integer> tempBallContainer, int randomNumber) {
        return tempBallContainer.contains(randomNumber);
    }


}
