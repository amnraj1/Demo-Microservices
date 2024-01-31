package com.example.Securedemo.components;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloComponent {
	@GetMapping("/hello")
	public String helloBack() {
		return "helloBack!";
	}
}
