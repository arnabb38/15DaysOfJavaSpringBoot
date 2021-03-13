package com.arnabb.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CourseApiApp {
    public static void main(String[] args) {

        // RUN
        // Static method
        // Setup default config
        // Starts Spring application context
        // Performs class path scan
        // Starts Tomcat server

        SpringApplication.run(CourseApiApp.class, args);

    }
}
