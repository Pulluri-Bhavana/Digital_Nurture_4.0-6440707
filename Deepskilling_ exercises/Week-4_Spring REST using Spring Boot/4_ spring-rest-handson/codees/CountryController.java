package com.cognizant.springrest.controller;

import com.cognizant.springrest.model.Country;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CountryController.class);

    @PostMapping("/countries")
    public Country addCountry(@RequestBody @Valid Country country) {
        LOGGER.info("START");
        LOGGER.info("Received country: {} - {}", country.getCode(), country.getName());
        LOGGER.info("END");
        return country;
    }
}
