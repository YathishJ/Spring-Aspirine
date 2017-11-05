package com.aspirine.global;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GlobalApplication {

	public static void main(String[] args) {
		org.springframework.context.ApplicationContext context = SpringApplication.run(GlobalApplication.class, args);
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.getHelloWorld();

	}
}
