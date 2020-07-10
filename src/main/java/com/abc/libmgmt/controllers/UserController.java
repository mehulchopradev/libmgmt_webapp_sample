package com.abc.libmgmt.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abc.libmgmt.domain.Student;
import com.abc.libmgmt.service.MasterServiceIntf;
import com.abc.libmgmt.service.StudentServiceIntf;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	StudentServiceIntf studentService;
	
	@Autowired
	private MasterServiceIntf masterService;
	
	@RequestMapping(value="/registeruser")
	public String registerUser(@ModelAttribute("student") Student student, Model model) {
		Student example = new Student();
		example.setUsername(student.getUsername());
		Optional<Student> optionalStudent = studentService.exists(example);
		
		if (optionalStudent.isPresent()) {
			model.addAttribute("student", student);
			model.addAttribute("countries", masterService.getCountries());
			return "public/register";
		} else {
			studentService.createNewStudent(student);
			return "redirect:/";
		}
	}
}
