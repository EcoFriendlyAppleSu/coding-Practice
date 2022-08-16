package io.github.EcoFriendlyAppleSu.baseball2.util;

import io.github.EcoFriendlyAppleSu.baseball2.exception.UserInputOutOfBounds;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class ConsoleInputTest {

    ConsoleInput consoleInput;

    @BeforeEach
    void setUp() {
        consoleInput = new ConsoleInput();
    }


    @DisplayName("User Input Inner Bounds Length Test")
    @ParameterizedTest
    @ValueSource(strings = "123")
    public void userInputTest(String input) throws Exception{
        InputStream in = generateUserInput(input);
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        assertThat(consoleInput.userInputNumber(scanner.nextLine())).isEqualTo("123");
    }

    @DisplayName("User Input Out Of Bounds Length Test")
    @ParameterizedTest
    @ValueSource(strings = "1234")
    public void userInputOutOfBoundsTest(String input) throws Exception{
        InputStream in = generateUserInput(input);
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        assertThatThrownBy(() -> consoleInput.userInputNumber(scanner.nextLine()))
                .isInstanceOf(UserInputOutOfBounds.class)
                .hasMessageContaining("세 자리 숫자를 입력해주세요");
    }

    public static InputStream generateUserInput(String input) {
        return new ByteArrayInputStream(input.getBytes());
    }

}