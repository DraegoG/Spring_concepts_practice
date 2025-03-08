package com.example.demo1.beanScope;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class RequestBeanScopeExample {
    String beanName;

    public RequestBeanScopeExample(){
        System.out.println("Initializing request bean");
    }

    public String getBeanName() {
        return beanName;
    }

    public void setBeanName(String beanName) {
        this.beanName = beanName;
    }

    public void callUpdated(){
        System.out.println("Employee info updated");
        System.out.println("The requestBean hashcode:" + this.hashCode());
    }
}
