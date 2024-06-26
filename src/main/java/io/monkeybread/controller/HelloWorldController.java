package io.monkeybread.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

	@GetMapping(path = "/showForm")
	public String showForm() {
		return "helloworld-form";
	}

	@GetMapping(path = "/processForm")
	public String processForm() {
		return "helloworld";
	}

	@GetMapping(path = "/processFormV2")
	public String letsShoutDude(HttpServletRequest request, Model model) {

		String theName = request.getParameter("studentName");

		theName = theName.toUpperCase();

		String result = "Yo! " + theName;

		model.addAttribute("message", result);
		return "helloworld";
	}

	@GetMapping(path = "/processFormV3")
	public String processFormV3(@RequestParam("studentName") String theName, Model model) {

		theName = theName.toUpperCase();

		String result = "Hey my firend form v3 " + theName;

		model.addAttribute("message", result);
		return "helloworld";
	}
	
}
