package com.example.demo;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	String home() {
		return "Spring is here!"; 
	}

	public static void main(String[] args) { //test22
		SpringApplication.run(DemoApplication.class, args);
	}
}