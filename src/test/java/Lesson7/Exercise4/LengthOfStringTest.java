package Lesson7.Exercise4;


import java.util.stream.Stream;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

class LengthOfStringTest {

  @ParameterizedTest
  @MethodSource("provideArguments")
  void shouldCountLengthOfString(String input, int expected) {
    int actualValue = LengthOfString.length(input);
    Assertions.assertEquals(expected, actualValue);
  }

  private static Stream<Arguments> provideArguments() {
    return Stream.of(
        Arguments.of("laptop", 6),
        Arguments.of("dzień dobry", 11),
        Arguments.of("jan kowalski", 12)
    );
  }
}