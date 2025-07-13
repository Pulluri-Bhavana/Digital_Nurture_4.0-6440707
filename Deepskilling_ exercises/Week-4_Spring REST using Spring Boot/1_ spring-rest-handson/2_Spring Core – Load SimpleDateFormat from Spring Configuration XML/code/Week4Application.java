package com.cognizant.springlearn;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Week4Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(Week4Application.class);

    public static void main(String[] args) throws Exception {
        // Start log
        LOGGER.info("START");

        // Run Spring Boot app
        SpringApplication.run(Week4Application.class, args);

        // Call displayDate()
        displayDate();

        // End log
        LOGGER.info("END");
    }

    public static void displayDate() throws Exception {
        LOGGER.info("START displayDate()");

        // Load Spring context from date-format.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");

        // Get SimpleDateFormat bean
        SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

        // Parse date string
        Date date = format.parse("31/12/2018");

        // Print parsed date
        LOGGER.debug("Parsed Date: {}", date);
        System.out.println("Parsed Date: " + date);

        LOGGER.info("END displayDate()");
    }
}
