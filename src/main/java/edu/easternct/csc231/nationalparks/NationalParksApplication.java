package edu.easternct.csc231.nationalparks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Defines a bunch of
 * defaults to make creating
 * a webapp fast and easy
 */
@SpringBootApplication
public class NationalParksApplication {

	/**
	 * Main event loop
	 */
    public static void main(String[] args) {
        SpringApplication.run(NationalParksApplication.class, args);
    }
}
