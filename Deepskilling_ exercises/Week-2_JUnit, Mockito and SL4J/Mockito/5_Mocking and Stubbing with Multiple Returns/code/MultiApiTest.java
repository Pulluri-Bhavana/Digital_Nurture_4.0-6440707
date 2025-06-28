package com.example5.mock;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MultiApiTest {

    @Test
    void testMultipleReturns() {
        // Step 1: Create mock object
        MultiApi mockApi = mock(MultiApi.class);

        // Step 2: Stub method to return multiple values
        when(mockApi.getMessage())
            .thenReturn("First Call")
            .thenReturn("Second Call")
            .thenReturn("Third Call");

        // Step 3: Test consecutive calls
        assertEquals("First Call", mockApi.getMessage());
        assertEquals("Second Call", mockApi.getMessage());
        assertEquals("Third Call", mockApi.getMessage());
    }
}
