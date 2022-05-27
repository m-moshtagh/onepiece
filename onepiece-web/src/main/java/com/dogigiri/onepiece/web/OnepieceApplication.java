package com.dogigiri.onepiece.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.dogigiri.onepiece")
public class OnepieceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnepieceApplication.class, args);
    }
}
