package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAPI3 {
	@Value("${tar}")
	private String col;
	@GetMapping("shows")
	public String display()
	{
		return "My favorite color is "+col;
	}

}
