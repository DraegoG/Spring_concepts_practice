package com.example.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsingBeanAnnotation {

    @Bean
    public PersonInfo createPersonObject(){
        return new PersonInfo(1, "Abhishek", "Bengaluru");
    }

}
