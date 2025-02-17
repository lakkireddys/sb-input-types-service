package com.edu.sb.input;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.edu.sb.input.config.ApplicationConfig;

@SpringBootApplication
@EnableConfigurationProperties(ApplicationConfig.class)
public class SbInputTypesServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbInputTypesServiceApplication.class, args);
	}

}
