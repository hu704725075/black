package com.hyp.black;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class BlackApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlackApplication.class, args);
    }
}
