import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.anyOf;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.internal.bytebuddy.matcher.ElementMatchers.is;

public class StreamMethodTest {

    /*
    * Stream의 첫 번째 요소를 반환 할 가능성이 높지만 이에 대한 보장은 없습니다.
    * */
    @DisplayName("findAny Method는 순서를 따지지 않고 요소를 찾을 때 사용")
    @Test
    public void streamFindAnyTest() throws Exception{
        //given
        List<String> list = Arrays.asList("A", "B", "C", "D");

        //when
        Optional<String> result = list.stream().findAny();

        //then
        assertThat(result.isPresent());
    }

    @Test
    public void streamFindFirstTest() throws Exception {
        //given
        List<String> list = Arrays.asList("A", "B", "C", "D");

        //when
        Optional<String> first = list.stream().findFirst();

        //then
        assertThat(first.get()).isEqualTo("A");
    }
}
