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

<<<<<<< HEAD
	public static void main(String[] args) { //test3ewfwe
=======
	public static void main(String[] args) { //test3 
>>>>>>> 1516953 (ete)
		SpringApplication.run(DemoApplication.class, args);
	}
}