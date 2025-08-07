package com.example.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {
        String username = "JohnDoe";
        int userId = 101;

        logger.info("User {} has logged in with ID {}", username, userId);
        logger.warn("User {} attempted to access a restricted area", username);
        logger.error("Login failed for user {} with ID {}", username, userId);
    }
}
