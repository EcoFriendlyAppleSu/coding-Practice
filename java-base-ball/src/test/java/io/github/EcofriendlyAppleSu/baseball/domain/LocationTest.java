package io.github.EcofriendlyAppleSu.baseball.domain;

import io.github.EcofriendlyAppleSu.baseball.exception.LocationOutOfIndex;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatCode;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

class LocationTest {

    @Test
    public void LocationAllowTest() throws Exception {
        assertThatCode(() -> new Location(2)).doesNotThrowAnyException();
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 3})
    public void LocationExceptionTest(int input) throws Exception {
        assertThatThrownBy(() -> new Location(input))
                .isInstanceOf(LocationOutOfIndex.class)
                .hasMessageContaining("1 부터 9 사이의 숫자를 입력해야 합니다.");
    }
}