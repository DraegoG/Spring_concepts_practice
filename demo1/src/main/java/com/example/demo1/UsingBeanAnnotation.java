package com.example.demo1;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsingBeanAnnotation {

    @Bean
    public PersonInfo createPersonObject() {
        return new PersonInfo(1, "Abhishek", "Bengaluru");
    }

    @PostConstruct
    public void postConstructExampleMethod() {
        System.out.println("The bean has been created. Running PostConstruct now!!!");
    }

    @PreDestroy
    public void preDestroyExampleMethod() {
        System.out.println("Running preDestroy!!!");
    }
}
