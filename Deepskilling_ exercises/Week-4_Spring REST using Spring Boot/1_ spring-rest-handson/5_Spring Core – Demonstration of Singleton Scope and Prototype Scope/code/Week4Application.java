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
        LOGGER.info("START");

        SpringApplication.run(Week4Application.class, args);

        displayDate();
        displayCountry();

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

    public static void displayCountry() {
        LOGGER.info("START displayCountry()");

        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");

        Country country = context.getBean("country", Country.class);

        Country anotherCountry = context.getBean("country", Country.class);

        LOGGER.debug("Country: {}", country.toString());
        LOGGER.debug("Another Country: {}", anotherCountry.toString());

        LOGGER.info("END displayCountry()");
    }

}
