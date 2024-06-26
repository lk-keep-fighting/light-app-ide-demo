package com.aims.demo.lightappide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.aims.lightapp.ide", "com.aims.demo.lightappide"})
public class LightAppIdeDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(LightAppIdeDemoApplication.class, args);
    }

}
