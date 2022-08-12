package io.github.EcoFriendlyAppleSu.carRacing.utils;

import io.github.EcoFriendlyAppleSu.carRacing.exception.StringTypeException;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

// , 가 아닌 다른 문자가 왔을 때 처리해 줘야 한다.
class StringSplitUtilTest {
    
    @DisplayName("Number, Comma, Alpha Test")
    @ParameterizedTest
    @ValueSource(strings = {"abcd,efgh,hrgk", "123,55,aaaa,RE"})
    public void stringSplitTest(String input) throws Exception {
        StringSplitUtil stringSplitUtil = new StringSplitUtil();
        assertThat(stringSplitUtil.modificationStringToNameStrings(input)).isEqualTo(input.split(","));
    }

    @Test
    public void stringSplitExceptionTest() throws Exception {
        String str = "$#@$#,''";
        assertThatThrownBy(() -> new StringSplitUtil().modificationStringToNameStrings(str))
                .isInstanceOf(StringTypeException.class)
                .hasMessageContaining("이름은 쉼표, 영문, 숫자만 가능합니다.");
    }

}