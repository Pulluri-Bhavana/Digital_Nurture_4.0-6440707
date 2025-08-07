package com.example.suite;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EvenCheckerTest {

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6})
    public void testIsEven(int number) {
        assertTrue(number % 2 == 0, number + " should be even");
    }
}
