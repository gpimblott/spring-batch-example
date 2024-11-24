package com.pimblott.springexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * Spring Boot runs schema-@@platform@@.sql automatically during startup. -all is the default for all platforms.
 * I have created a schema-all.sql
 */
@SpringBootApplication
public class SpringExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringExampleApplication.class, args);
    }

}
