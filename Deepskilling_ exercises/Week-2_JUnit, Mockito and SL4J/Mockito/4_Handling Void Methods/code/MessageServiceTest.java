package com.example4.mock;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MessageServiceTest {

    @Test
    void testVoidMethod() {
        // Step 1: Create mock
        Notifier mockNotifier = mock(Notifier.class);

        // Step 2: Stub the void method (optional if just verifying)
        doNothing().when(mockNotifier).send(anyString());

        // Step 3: Use mock in service
        MessageService service = new MessageService(mockNotifier);
        service.sendMessage("Hello");

        // Step 4: Verify interaction
        verify(mockNotifier).send("Hello");
    }
}
