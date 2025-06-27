package com.example.math;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

public class SimpleMathTest {

    SimpleMath math = new SimpleMath();

    @Test
    public void testAdd() {
        assertEquals(9, math.add(4, 5));
    }

    @Test
    public void testSubtract() {
        assertEquals(1, math.subtract(6, 5));
    }

    @Test
    public void testMultiply() {
        assertEquals(20, math.multiply(4, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, math.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> math.divide(5, 0));
    }
}
