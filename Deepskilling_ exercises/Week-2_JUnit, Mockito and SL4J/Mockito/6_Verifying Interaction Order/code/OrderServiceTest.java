package com.example6.mock;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class OrderServiceTest {

    @Test
    void testInteractionOrder() {
        // Step 1: Create mock
        OrderService mockService = mock(OrderService.class);

        // Step 2: Call methods in order
        mockService.stepOne();
        mockService.stepTwo();
        mockService.stepThree();

        // Step 3: Verify order using InOrder
        InOrder inOrder = inOrder(mockService);
        inOrder.verify(mockService).stepOne();
        inOrder.verify(mockService).stepTwo();
        inOrder.verify(mockService).stepThree();
    }
}
