package leetcode.examples.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class StringToIntegerTest {

    private final StringToInteger stringToInteger = new StringToInteger();

    @ParameterizedTest
    @MethodSource("strings")
    void shouldConvertGiveStringToInteger(String str, int value) {
        assertEquals(value, stringToInteger.stringToInteger(str));
    }

    static Stream<Arguments> strings() {
        return Stream.of(
                Arguments.arguments("123", 123),
                Arguments.arguments("2131s", -1),
                Arguments.arguments("-10", -10));
    }
}