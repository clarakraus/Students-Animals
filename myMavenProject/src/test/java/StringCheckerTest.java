import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringCheckerTest {

    @Test
    void shouldReturnTrueBecauseStringLengthIsGreaterThan20AndContainsFancy() {
        // Given
        String toTest = "Hallo ziemlich langer fancy String";

        // When
        boolean actual = StringChecker.checkString(toTest);

        // Then
        Assertions.assertTrue(actual);
    }

    @Test
    void shouldReturnFalseBecauseStringIsTooShort() {
        // Given
        String toTest = "Hallo fancy";

        // When
        boolean actual = StringChecker.checkString(toTest);

        // Then
        Assertions.assertFalse(actual);
    }

    @Test
    void shouldReturnFalseBecauseStringDoesNotContaintFancy() {
        // Given
        String toTest = "Hallo ziemlich langer String";

        // When
        boolean actual = StringChecker.checkString(toTest);

        // Then
        Assertions.assertFalse(actual);
    }

    @Test
    void shouldReturnFalseBecauseNoConditionIsFulfilled() {
        // Given
        String toTest = "Hallo";

        // When
        boolean actual = StringChecker.checkString(toTest);

        // Then
        Assertions.assertFalse(actual);
    }

}