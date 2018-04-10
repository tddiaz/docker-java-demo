package com.github.tddiaz.dockerjavademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DockerJavaDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerJavaDemoApplication.class, args);
	}
}

@RestController("demo")
class DemoController {

	@GetMapping
	public String get() {
		return "rest response from running container";
	}
}
