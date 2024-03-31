package io.monkeybread.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import io.monkeybread.model.Student;

@Controller
public class StudentController {
	
	@GetMapping("/showStudentForm")
	public String showForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "student-form";
	}
	
	@PostMapping("/processStudentForm")
	public String processStudentForm(@ModelAttribute("student") Student student) {
		System.out.println(student);
		return "student-conformation";
	}

}
