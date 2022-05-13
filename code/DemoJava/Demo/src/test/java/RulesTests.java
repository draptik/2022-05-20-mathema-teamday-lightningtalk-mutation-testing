import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RulesTests {

    private final Rules rules = new Rules();

    @Test
    void helloWorld() {
        var expected = "Hello World";
        assertEquals(expected, rules.helloWorld());
    }
//
//    @ParameterizedTest
//    @CsvSource({""})
//    void isValid1(String input, Boolean expected) {
//        assertEquals(expected, rules.isValid(input));
//    }
}
