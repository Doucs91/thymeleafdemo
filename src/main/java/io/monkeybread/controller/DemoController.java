package io.monkeybread.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

	@GetMapping(path = "/hello")
	public String sasyhello(Model model) {
		model.addAttribute("theDate", LocalDateTime.now());
		return "helloworld";
	}

}
