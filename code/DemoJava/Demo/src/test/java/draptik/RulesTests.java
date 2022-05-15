package draptik;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RulesTests {

    private final Rules rules = new Rules();

    @Test
    void helloWorld() {
        var expected = "Hello World";
        assertEquals(expected, rules.helloWorld());
    }

    @ParameterizedTest
    @MethodSource("sampleDataIsValid")
    void isValid(String input, Boolean expected) {
        assertEquals(expected, rules.isValid(input));
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
