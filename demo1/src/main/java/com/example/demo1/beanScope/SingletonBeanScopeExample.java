package com.example.demo1.beanScope;

import org.springframework.stereotype.Component;

@Component
public class SingletonBeanScopeExample {
    String beanName;

    public SingletonBeanScopeExample() {
        System.out.println("Initializing Singleton bean");
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }
}
