package io.github.EcofriendlyAppleSu.baseball.util;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GenerateNumberImplTest {


    @RepeatedTest(50)
    public void generateRandomNumberTest() throws Exception {
        GenerateNumber generateNumber = new GenerateNumberImpl();
        assertThat(generateNumber.generator().size()).isEqualTo(3);
    }
}
