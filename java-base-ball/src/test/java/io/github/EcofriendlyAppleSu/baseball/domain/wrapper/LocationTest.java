package io.github.EcofriendlyAppleSu.baseball.domain.wrapper;

import static org.junit.jupiter.api.Assertions.*;

import io.github.EcofriendlyAppleSu.baseball.domain.exception.LocationOutOfRangeException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class LocationTest {


  @Test
  public void locationInnerBoundTest() throws Exception {
    assertDoesNotThrow(() -> Location.from(1));
  }

  @ParameterizedTest
  @ValueSource(ints = {-1, 3})
  public void locationOutOfBoundaryExceptionTest(int boundary) throws Exception {
    Assertions.assertThatThrownBy(() -> Location.from(boundary))
        .isInstanceOf(LocationOutOfRangeException.class);
  }

}
