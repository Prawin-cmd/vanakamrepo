package com.Vanakam.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VanakamController {
   
	@GetMapping(value="/get")
	public String get() {
		return "Hello";
	}
}
