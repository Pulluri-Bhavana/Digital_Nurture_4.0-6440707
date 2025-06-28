package com.example.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AppenderExample {

    private static final Logger logger = LoggerFactory.getLogger(AppenderExample.class);

    public static void main(String[] args) {
        logger.info("This message should appear in both console and file");
        logger.debug("This is a DEBUG level message");
        logger.warn("This is a WARNING message");
        logger.error("This is an ERROR message");
    }
}
