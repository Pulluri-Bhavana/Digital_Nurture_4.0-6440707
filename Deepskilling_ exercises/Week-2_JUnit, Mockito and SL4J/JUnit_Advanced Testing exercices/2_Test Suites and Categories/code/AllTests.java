package com.example.suite;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({
    CalculatorTest.class,
    EvenCheckerTest.class
})
public class AllTests {
    // This class is empty but acts as a suite runner
}
