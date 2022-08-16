package io.github.EcoFriendlyAppleSu.carRacing;

import io.github.EcoFriendlyAppleSu.carRacing.exception.CarNameOutOfLength;
import io.github.EcoFriendlyAppleSu.carRacing.utils.MoveStrategy;
import io.github.EcoFriendlyAppleSu.carRacing.utils.RandomStrategy;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Random;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    Car car = null;

    @ParameterizedTest
    @ValueSource(strings = {"pobi","crong","honux"})
    public void carLengthTest(String input) throws Exception {
        assertThatCode(() -> new Car(input)).doesNotThrowAnyException();
    }

    @ParameterizedTest
    @ValueSource(strings = {"pobi1231","23crong","423honux"})
    public void carLengthOutOfLengthTest(String input) throws Exception {
        assertThatThrownBy(() -> new Car(input))
                .isInstanceOf(CarNameOutOfLength.class)
                .hasMessageContaining("자동차 이름의 길이는 5를 넘을 수 없습니다.");
    }

    @Test
    public void carMoveFrontTest() throws Exception {
        Car car = new Car("pobi"); // position == 0
        MoveStrategy moveStrategy = () -> true; // 반환 값을 고정
        car.movePosition(moveStrategy);
        assertThat(car.currentPosition()).isEqualTo(1); // position += 1, 함수형 인터페이스를 사용해 메
        // assertThat(car.movePosition(MoveStrategy::canMove())).isEqualTo(1); static으로 선언된 메서드가 존재해야 사용할 수 있다. 구현체 또한 존해 필요
    }
    @Test
    public void carDoesNotMoveFrontTest() throws Exception {
        Car car = new Car("pobi");
        MoveStrategy moveStrategy = () -> false; // 반환 값을 고정
        car.movePosition(moveStrategy);
        assertThat(car.currentPosition()).isEqualTo(0);
    }

    @Test
    public void carTestDoesNotUsingLambda() throws Exception {
        Car car = new Car("abcd");
        car.movePosition(new MoveStrategy() {
            @Override
            public boolean canMove() {
                return true;
            }
        });
        assertThat(car.currentPosition()).isEqualTo(1);
    }
}