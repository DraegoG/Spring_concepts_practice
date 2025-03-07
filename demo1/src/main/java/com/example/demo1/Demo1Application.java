package com.example.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Demo1Application.class, args);

		System.out.println("Started Springboot app!!!");
	}

}
