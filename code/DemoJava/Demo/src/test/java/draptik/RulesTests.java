package draptik;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

class RulesTests {

    private final Rules rules = new Rules();

    @Test
    void helloWorld() {
        var expected = "Hello World";
        assertThat(rules.helloWorld()).isEqualTo(expected);
    }

    @ParameterizedTest
    @MethodSource("sampleDataIsValid")
    void isValid(String input, Boolean expected) {
        assertThat(rules.isValid(input)).isEqualTo(expected);
    }

    private static Stream<Arguments> sampleDataIsValid() {
        return Stream.of(
                Arguments.of("", false),
                Arguments.of("a", true),
                Arguments.of(null, false),
                Arguments.of("123", true),
                Arguments.of("1234567890x", false)
        );
    }
}
