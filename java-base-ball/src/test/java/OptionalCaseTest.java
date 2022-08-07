import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/*
* Optional 인스턴스는 모든 타입의 참조 변수를 저장할 수 있습니다.
* orElse() 메소드는 메소드의 인자를 항상 평가한다. 즉, orElse에 객체를 생성해서 Optional 객체가
* 비어있는 경우 리턴하도록 할 수도 있는데, orElse() 메소드의 인자 평가가 항상 발생한다.
* 따라서, 객체를 생성하는 비용이 크다면 orElse() 메소드를 사용하면 안된다.
* */
public class OptionalCaseTest {


    @DisplayName("Optional Nullable Not Null")
    @Test
    public void optionalOfNullableIfContentHas() throws Exception{
        Optional<String> optional = Optional.ofNullable("Hello World");
        System.out.println(optional.isPresent());
        assertThat(optional.get()).isEqualTo("Hello World");
    }

    @DisplayName("Optional Nullable Null")
    @Test
    public void optionalOfNullableIfContentDoesNotHave() throws Exception {
        Optional<String> optional = Optional.ofNullable(null);
        assertThat(optional).isEqualTo(Optional.empty());

        assertThat("HelloWorld").isEqualTo(Optional.empty().orElse("HelloWorld"));
    }

    @DisplayName("Optional orElse Test - 반환 값이 null일 때는 orElse 안에 있는 것을 값으로 반환한다.")
    @Test
    public void optionalOrElseTest() throws Exception {
        String givenString = "XYZ";
        String result = Optional.of(givenString).filter(v -> v.startsWith("AB")).orElse("Ho");
        assertThat(result).isEqualTo("Ho");
    }

}
