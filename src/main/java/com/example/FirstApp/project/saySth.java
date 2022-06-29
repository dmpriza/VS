package com.example.FirstApp.project;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableJpaRepositories
public class saySth {


	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public String mainEntrypoint(){
		return "default page";
	}

	@GetMapping("/test")
	public String testMethod(){
		return "successful";
	}

	@GetMapping("/hello")
	public String sayHello(){
		return "Hello World";
	}

	@GetMapping("/echo/{value}")
	public String echoValue(@PathVariable String value){
		return "echo "+value;
	}

    }