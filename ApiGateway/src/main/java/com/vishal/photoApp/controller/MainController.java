package com.vishal.photoApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainController {

	@GetMapping("/check")
	public String check()
	{
		return "API gateway is working";
	}
}
