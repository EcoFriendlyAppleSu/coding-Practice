package io.github.EcofriendlyAppleSu.baseball.infra;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class ValueChangerTest {

  @Test
  public void computerInputNumberStringToCollectionIntegerTest() throws Exception {
    String str = "123";
    Assertions.assertThat(ValueChanger.run(str)).isEqualTo(List.of(1, 2, 3));
  }

}
