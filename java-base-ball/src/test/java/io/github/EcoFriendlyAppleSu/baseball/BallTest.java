package io.github.EcoFriendlyAppleSu.baseball;

import io.github.EcoFriendlyAppleSu.baseball.exception.BallNumberOutOfRangeException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class BallTest {
    
    @Test
    public void ballNumberTest() throws Exception{
        assertThatThrownBy(() -> new Ball(99))
                .isInstanceOf(BallNumberOutOfRangeException.class)
                .hasMessageContaining("볼 숫자는 1부터 9의 값이어야 합니다.");
    }
    
}
