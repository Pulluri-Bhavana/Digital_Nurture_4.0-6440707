package com.example.tests;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer;
import static org.junit.jupiter.api.Assertions.assertTrue;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    void testOne() {
        System.out.println("Running testOne");
        assertTrue(true);
    }

    @Test
    @Order(2)
    void testTwo() {
        System.out.println("Running testTwo");
        assertTrue(true);
    }

    @Test
    @Order(3)
    void testThree() {
        System.out.println("Running testThree");
        assertTrue(true);
    }
}
