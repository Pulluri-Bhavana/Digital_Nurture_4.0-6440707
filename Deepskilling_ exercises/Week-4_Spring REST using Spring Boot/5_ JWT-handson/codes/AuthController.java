package com.cognizant.jwtapp.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;
import org.springframework.web.bind.annotation.*;

import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthController {

    private final String SECRET_KEY = "mysecretkeymysecretkeymysecretkeymysecretkey";

    @PostMapping("/authenticate")
    public Map<String, String> authenticate(@RequestParam String username, @RequestParam String password) {
        // Dummy authentication check
        if ("user".equals(username) && "password".equals(password)) {
            String token = Jwts.builder()
                    .setSubject(username)
                    .setIssuedAt(new Date())
                    .setExpiration(new Date(System.currentTimeMillis() + 60 * 60 * 1000)) // 1 hour expiry
                    .signWith(Keys.hmacShaKeyFor(SECRET_KEY.getBytes(StandardCharsets.UTF_8)), SignatureAlgorithm.HS256)
                    .compact();

            Map<String, String> response = new HashMap<>();
            response.put("token", token);
            return response;
        } else {
            throw new RuntimeException("Invalid credentials");
        }
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello, JWT Authenticated User!";
    }
}
