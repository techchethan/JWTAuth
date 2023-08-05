package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/test")
	public ResponseEntity<String> hello() {
		return new ResponseEntity<String>("Hello World!", HttpStatus.OK);
	}
	// spring-boot-oauth2-resource-server implementation
	@GetMapping("/user")
	public ResponseEntity<String> user() {
		return new ResponseEntity<String>("Hello User!", HttpStatus.OK);
	}
	// spring-boot-oauth2-resource-server implementation
	@GetMapping("/admin")
	public ResponseEntity<String> admin() {
		return new ResponseEntity<String>("Hello Admin!", HttpStatus.OK);
	}



}
