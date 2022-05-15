package draptik;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

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
    @MethodSource
    void isValid_positiveTests(String input) {
        assertThat(rules.isValid(input)).isTrue();
    }

    private static Stream<String> isValid_positiveTests() {
        return Stream.of("a","123");
    }

    @ParameterizedTest
    @MethodSource
    void isValid_negativeTests(String input) {
        assertThat(rules.isValid(input)).isFalse();
    }

    private static Stream<String> isValid_negativeTests() {
        return Stream.of(null,"","1234567890x");
    }
}
