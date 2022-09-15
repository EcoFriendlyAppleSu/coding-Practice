package io.github.EcoFriendlyAppleSu.stringCalculator;

import io.github.EcoFriendlyAppleSu.stringCalculator.exception.DivideZeroException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void addTest() throws Exception {
        assertThat(stringCalculator.add(1, 3)).isEqualTo(4);
    }

    @Test
    public void minusTest() throws Exception {
        assertThat(stringCalculator.minus(1, 3)).isEqualTo(-2);
    }

    @Test
    public void multiTest() throws Exception {
        assertThat(stringCalculator.multi(1, 3)).isEqualTo(3);
    }

    @Test
    public void divideSuccessTest() throws Exception {
        assertThat(stringCalculator.divide(3, 1)).isEqualTo(3);
    }

    @Test
    public void divideFailTest() throws Exception {
        assertThatThrownBy(() -> stringCalculator.divide(3, 0))
                .isInstanceOf(DivideZeroException.class);
    }
    
    @Test
    public void makeResultTest() throws Exception {
        assertThat(stringCalculator.makeResult("1 + 3")).isEqualTo(4);
    }

}