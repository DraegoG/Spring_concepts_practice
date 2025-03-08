package com.example.demo1;

import com.example.demo1.beanScope.PrototypeBeanScopeExample;
import com.example.demo1.beanScope.SingletonBeanScopeExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Demo1Application.class, args);

		System.out.println("Started SpringBoot app!!!");

		//Creating Singleton beans
		SingletonBeanScopeExample s1 = applicationContext.getBean(SingletonBeanScopeExample.class);
		SingletonBeanScopeExample s2 = applicationContext.getBean(SingletonBeanScopeExample.class);
		System.out.printf("Singleton beans - s1:%s  s2:%s\n", s1.hashCode(), s2.hashCode());


		//Creating Prototype beans
		PrototypeBeanScopeExample p1 = applicationContext.getBean(PrototypeBeanScopeExample.class);
		PrototypeBeanScopeExample p2 = applicationContext.getBean(PrototypeBeanScopeExample.class);
		System.out.printf("Prototype beans - p1:%s  p2:%s\n", p1.hashCode(), p2.hashCode());


	}

}
