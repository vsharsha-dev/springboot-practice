package com.harshaspring.SpringBootStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootStarterApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootStarterApplication.class, args);

		Alien obj = context.getBean(Alien.class);
		obj.code();
	}

}
