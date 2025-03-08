package com.example.demo1.beanScope;


import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class SessionBeanScopeExample {
    String beanName;

    public SessionBeanScopeExample(){
        System.out.println("initializing session scope bean");
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public void updateDetails(){
        System.out.println("Contract employee details updated");
        System.out.println("The session bean hashcode:" + this.hashCode());
    }
}

