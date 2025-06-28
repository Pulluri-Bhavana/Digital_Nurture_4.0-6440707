package com.example1.mock;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.mockito.ArgumentMatchers.*;

public class ArgumentServiceTest {

    @Test
    void testArgumentMatching() {
        ArgumentService mockService = mock(ArgumentService.class);
        mockService.process("Alice", 25);
        verify(mockService).process(eq("Alice"), anyInt());
    }
}
