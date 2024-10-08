package com.co.Guiral.leydi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class LeydiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeydiApplication.class, args);
	}

}
