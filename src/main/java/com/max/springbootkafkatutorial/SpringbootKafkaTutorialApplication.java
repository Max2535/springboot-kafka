package com.max.springbootkafkatutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@SpringBootApplication
@EnableKafka
public class SpringbootKafkaTutorialApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootKafkaTutorialApplication.class, args);
    }

}
