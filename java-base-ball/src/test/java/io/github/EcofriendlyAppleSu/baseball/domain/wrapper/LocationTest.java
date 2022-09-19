package io.github.EcofriendlyAppleSu.baseball.domain.wrapper;

import io.github.EcofriendlyAppleSu.baseball.domain.exception.LocationOutOfRangeException;
import io.github.EcofriendlyAppleSu.baseball.util.ConsoleOut;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class LocationTest {

    @Test
    public void LocationInnerBoundaryValueTest() throws Exception {
        assertThat(Location.from(1)).isEqualTo(Location.from(1));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 3})
    public void LocationOutOfRangeValueExceptionTest(int location) throws Exception {
        assertThatThrownBy(() -> Location.from(location)).isInstanceOf(LocationOutOfRangeException.class)
                .hasMessage(ConsoleOut.LOCATION_EXCEPTION_MESSAGE);
    }

}
