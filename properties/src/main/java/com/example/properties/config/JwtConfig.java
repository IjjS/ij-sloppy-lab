package com.example.properties.config;

import jakarta.annotation.PostConstruct;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("jwt")
public class JwtConfig {

    private String secretKey;

    private String expirationMinutes;

    @PostConstruct
    private void print() {
        System.out.println("Secret Key: " + secretKey);
        System.out.println("Expiration Minutes: " + expirationMinutes);
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    public void setExpirationMinutes(String expirationMinutes) {
        this.expirationMinutes = expirationMinutes;
    }

}
