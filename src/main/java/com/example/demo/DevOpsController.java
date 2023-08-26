package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOpsController {
	@GetMapping(value = "/hi")
	public String getHello() {
		return "HELLO WORLD";
	}

}
