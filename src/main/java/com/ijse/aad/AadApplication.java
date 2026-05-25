package com.ijse.aad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@Configuration - mark this as a configuration class
//@EnableAutoConfiguration - spring automatically configures based on the dependencies
// @ComponentScan - find all out controllers and services automaatically
@SpringBootApplication
public class AadApplication {

    public static void main(String[] args) {

        SpringApplication.run(AadApplication.class, args);
    }

}
