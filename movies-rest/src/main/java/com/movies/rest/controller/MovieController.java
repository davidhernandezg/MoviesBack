package com.movies.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/api")
public class MovieController {

	@RequestMapping(value="/HelloWorld", method = RequestMethod.GET)
	public String HelloWorld() {
		System.out.println("HelloWorld");
		return "HelloWorld";
	}
}
