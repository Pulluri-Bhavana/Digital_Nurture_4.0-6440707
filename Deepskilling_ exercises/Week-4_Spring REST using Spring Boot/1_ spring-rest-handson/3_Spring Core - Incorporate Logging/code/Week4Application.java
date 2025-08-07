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

    ApplicationContext context = new ClassPathXmlApplicationContext("date-format.xml");

    SimpleDateFormat format = context.getBean("dateFormat", SimpleDateFormat.class);

    Date date = format.parse("31/12/2018");

    LOGGER.debug("Parsed Date: {}", date);

    LOGGER.info("END displayDate()");
}

}
