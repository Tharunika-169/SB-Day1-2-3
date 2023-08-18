package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAPIda2 {
	@Value("${var}")
	private String studentname;
	@GetMapping("showing")
	public String display()
	{
		return "Welcome "+studentname+"!";
	}

}
