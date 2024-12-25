package com.springpractice.SpringServerLayers;

import com.springpractice.SpringServerLayers.model.Alien;
import com.springpractice.SpringServerLayers.model.Laptop;
import com.springpractice.SpringServerLayers.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Application.class, args);

//		Alien obj = context.getBean(Alien.class);
//		obj.code();

		LaptopService service = context.getBean(LaptopService.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);
	}

}
