package com.github_actions.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GithubactionsApplication {

	
	@GetMapping("welcome")
	public String message() {
		return "Welcome";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(GithubactionsApplication.class, args);
	}

}
