package com.example.demo.employee;

import org.springframework.boot.SpringApplication; // Provides the method used to launch Spring Boot.
import org.springframework.boot.autoconfigure.SpringBootApplication; // Provides the annotation that configures the main class as a Spring Boot application.

import java.util.*;
import java.util.ArrayList;

@SpringBootApplication
public class EmployeeApplication {
        public static void main(String[] args) {
            System.out.println("My name is Mohammad Jabir");
            SpringApplication.run(EmployeeApplication.class);
        }
}
