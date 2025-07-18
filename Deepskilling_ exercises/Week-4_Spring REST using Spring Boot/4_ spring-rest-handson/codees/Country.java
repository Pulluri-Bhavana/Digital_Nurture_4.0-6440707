package com.cognizant.springrest.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Country {

    @NotNull(message = "Code cannot be null")
    @Size(min = 2, max = 2, message = "Code must be exactly 2 characters")
    private String code;

    @NotNull(message = "Name cannot be null")
    private String name;

    // Getters and Setters
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
