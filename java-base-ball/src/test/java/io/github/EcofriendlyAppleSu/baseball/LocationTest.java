package io.github.EcofriendlyAppleSu.baseball;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

import io.github.EcofriendlyAppleSu.baseball.exception.LocationValueOutOfIndexException;
import jdk.javadoc.doclet.Taglet;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class LocationTest {

    @Test
    public void locationValueTest() throws Exception {
        Assertions.assertDoesNotThrow(() -> Location.from(2));
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, 3})
    public void locationOutOfValueExceptionTest(int location) throws Exception {
        assertThatThrownBy(() -> Location.from(location)).isInstanceOf(LocationValueOutOfIndexException.class);
    }

}
