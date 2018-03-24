package com.raghu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(path="/")
	public String testWorlcProject() {
		return "Welcome to World Project";
	}
}
