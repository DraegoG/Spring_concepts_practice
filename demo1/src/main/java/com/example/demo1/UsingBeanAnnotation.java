package com.example.demo1;

import com.example.demo1.model.ContractEmployee;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsingBeanAnnotation {

    @Bean
    public ContractEmployee createDefaultUser() {
        return new ContractEmployee(1, "Default user", 28);
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
