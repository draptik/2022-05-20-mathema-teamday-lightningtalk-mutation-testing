package draptik;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

class RulesTests {

    private final Rules rules = new Rules();

    @Test
    void helloWorld() {
        assertThat(rules.helloWorld()).isEqualTo("Hello World");
    }

    @ParameterizedTest
    @ValueSource(strings = {"a", "123"})
    void isValid_positiveTests(String input) {
        assertThat(rules.isValid(input)).isTrue();
    }

    @ParameterizedTest
    @NullAndEmptySource
    @ValueSource(strings = {"1234567890x"})
    void isValid_negativeTests(String input) {
        assertThat(rules.isValid(input)).isFalse();
    }
}
