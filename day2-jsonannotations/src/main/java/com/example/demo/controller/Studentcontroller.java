package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;

@RestController
public class Studentcontroller {

	@GetMapping("show")
	public List<Student> fun(){
	return Arrays.asList(new Student(1,"tHARUNIKA","ECE"),new Student(2,"Subasri","ECE"));
	}
}
