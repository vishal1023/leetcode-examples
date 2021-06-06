package leetcode.examples.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class MultiplyTwoStringsTest {

    private final MultiplyTwoStrings multiplyTwoStrings = new MultiplyTwoStrings();

    @ParameterizedTest
    @MethodSource("stringsToMultiply")
    void shouldMultiplyGiveTwoStringsAndReturnResult(String num1, String num2, String result) {
        assertEquals(result, multiplyTwoStrings.multiplyStrings(num1, num2));
    }

    static Stream<Arguments> stringsToMultiply() {
        return Stream.of(
                Arguments.arguments("12", "5", "60"),
                Arguments.arguments("21", "-3", "-63"),
                Arguments.arguments("223234234234234234234234234", "10000000000000000000", "2232342342342342342342342340000000000000000000"),
                Arguments.arguments("-10", "-20", "200"));
    }
}