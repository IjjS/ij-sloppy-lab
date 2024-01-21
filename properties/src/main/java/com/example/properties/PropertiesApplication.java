package com.example.properties;

import com.example.properties.config.AppConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class PropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropertiesApplication.class, args);
	}

}
