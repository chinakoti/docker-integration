package com.test.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DockerIntegrationApplication {
	
	@GetMapping("/")
	public String getMessage() {
		return "Hello Docker Integration Example";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockerIntegrationApplication.class, args);
	}

}
