package com.sky;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SkyKrkrApp {

    public static void main(String[] args) {

        ApplicationContext app = SpringApplication.run(SkyKrkrApp.class,args);

    }
}