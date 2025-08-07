package com.example.aaa;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    private BankAccount account;

    // Setup method (runs before each test)
    @Before
    public void setUp() {
        account = new BankAccount();
        System.out.println("Setup: New account created");
    }

    // Teardown method (runs after each test)
    @After
    public void tearDown() {
        account.reset();
        System.out.println("Teardown: Account reset to zero");
    }

    @Test
    public void testDeposit() {
        // Arrange
        int depositAmount = 100;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(100, account.getBalance());
    }

    @Test
    public void testWithdraw() {
        // Arrange
        account.deposit(200);

        // Act
        account.withdraw(50);

        // Assert
        assertEquals(150, account.getBalance());
    }

    @Test
    public void testWithdrawExceedingBalance() {
        // Arrange
        account.deposit(100);

        // Act
        account.withdraw(150); // should not allow

        // Assert
        assertEquals(100, account.getBalance());
    }
}
