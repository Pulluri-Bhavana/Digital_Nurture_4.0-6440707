package com.example.mock;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    // Exercise 1: Mocking and Stubbing
    // @Test
    // public void testExternalApi() {
    //     ExternalApi mockApi = mock(ExternalApi.class);
    //     when(mockApi.getData()).thenReturn("Mock Data");
    //     MyService service = new MyService(mockApi);
    //     String result = service.fetchData();
    //     assertEquals("Mock Data", result);
    // }

    //  Exercise 2: Verifying Interactions
    @Test
    public void testVerifyInteraction() {
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.fetchData(); // This should trigger the mock call
        verify(mockApi).getData(); // ✅ Verifies that getData() was called
    }
}
