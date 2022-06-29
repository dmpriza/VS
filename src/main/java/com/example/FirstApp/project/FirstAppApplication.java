package com.example.FirstApp.project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

//@RestController
//@EntityScan("com.example.*") 
@ComponentScan("com.example.FirstApp.repository.ItemRepository")
//@CrossOrigin(origins = "https://localhost:8090")
@SpringBootApplication
public class FirstAppApplication {
	public static void main(String[] args) {
		SpringApplication.run(FirstAppApplication.class, args);
	}

}
