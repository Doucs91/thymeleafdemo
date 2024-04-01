package io.monkeybread.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import io.monkeybread.model.Student;

@Controller
public class StudentController {
	@Value("${countries}")
	private List<String> countries;
	
	@GetMapping("/showStudentForm")
	public String showForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		model.addAttribute("countries", countries);
		return "student-form";
	}
	
	@PostMapping("/processStudentForm")
	public String processStudentForm(@ModelAttribute("student") Student student) {
		System.out.println(student);
		return "student-conformation";
	}

}
