package com.mani;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAwsDeploymentApplication {

	@GetMapping("/message")
	public String message() {
		return "Welcome to CI/CD...Checking the status";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsDeploymentApplication.class, args);
	}

}
