package com.coderslab;

import org.springframework.boot.SpringApplication;
/**
 * @author Zubayer Ahamed
 */
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class CoderslabApplication {

	public static void main(String[] args) {
		SpringApplication.run(CoderslabApplication.class, args);
	}
}
