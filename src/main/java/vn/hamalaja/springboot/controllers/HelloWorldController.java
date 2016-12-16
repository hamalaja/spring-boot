package vn.hamalaja.springboot.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Value("${foo}")
	private String name;


	@RequestMapping("/")
	public String index() {
		return "Greetings from Spring Boot!" + name;
	}
}
