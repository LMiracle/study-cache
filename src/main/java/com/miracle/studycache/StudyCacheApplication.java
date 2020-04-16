package com.miracle.studycache;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


@EnableCaching
@SpringBootApplication
public class StudyCacheApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudyCacheApplication.class, args);
    }

}
