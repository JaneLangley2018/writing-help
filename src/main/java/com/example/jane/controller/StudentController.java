package com.example.jane.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;

@Controller
public class StudentController {
	
	@RequestMapping("/")
	public String home() {
		return "home.html";
	}
	public String addStudent()
	{
		return "home.html";
	}

}
