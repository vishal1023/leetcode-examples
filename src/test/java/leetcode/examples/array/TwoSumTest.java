package leetcode.examples.array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TwoSumTest {

    private final TwoSum twoSum = new TwoSum();

    @ParameterizedTest
    @MethodSource("intArrayIntAndIntArrayProvider")
    void shouldReturnIndexOfElementsWhoseSumEqualsTarget(int[] nums, int target, int[] expectedResult) {

        assertArrayEquals(expectedResult, twoSum.twoSum(nums, target));
    }

    static Stream<Arguments> intArrayIntAndIntArrayProvider() {
        return Stream.of(
                Arguments.arguments(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
                Arguments.arguments(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
                Arguments.arguments(new int[]{3, 3}, 6, new int[]{0, 1})
        );
    }
}