package io.monkeybread.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWorldController {

	@GetMapping(path="/showForm")
	public String showForm() {
		return "helloworld-form";
	}
}
