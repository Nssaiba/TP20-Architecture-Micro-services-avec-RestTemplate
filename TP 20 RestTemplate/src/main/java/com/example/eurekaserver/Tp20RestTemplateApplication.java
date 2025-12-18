package com.example.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class Tp20RestTemplateApplication {

    public static void main(String[] args) {
        SpringApplication.run(Tp20RestTemplateApplication.class, args);
    }

}
