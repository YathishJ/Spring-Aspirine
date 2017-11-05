package com.aspirine.global;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Main application to run the project.
 *
 * @author yathish.
 */
@SpringBootApplication
public class GlobalApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(GlobalApplication.class, args);

		//Spring by default will recognize bean name from class name with camel case word
		HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
		helloWorld.getHelloWorld();

	}
}
