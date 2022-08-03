package io.github.EcoFriendlyAppleSu.baseball;

import io.github.EcoFriendlyAppleSu.baseball.exception.LocationOutOfRangeException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class LocationTest {

//    @Test
//    public void locationOutOfRangeTest() throws Exception{
//        Location location = new Location(3);
//        assertThat(location.checkNumber()).isFalse();
//    }

    @ParameterizedTest
    @ValueSource(ints = {0,1,2})
    public void locationInnerRangeTest(int input) throws Exception{
        Location location = new Location(input);
        assertThat(location.checkNumber()).isTrue();
    }

    @DisplayName("Location Wrapper Class Exception Test")
    @ParameterizedTest
    @ValueSource(ints = {-1, 3})
    public void locationOutOfRangeExceptionTest(int input) throws Exception {
        assertThatThrownBy(() -> new Location(input))
                .isInstanceOf(LocationOutOfRangeException.class)
                .hasMessageContaining("위치는 1부터 3 사이여야 합니다.");
    }
}
