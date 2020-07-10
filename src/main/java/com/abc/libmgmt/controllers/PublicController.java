package com.abc.libmgmt.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.abc.libmgmt.domain.Student;
import com.abc.libmgmt.service.MasterServiceIntf;

@Controller
public class PublicController {
	
	@Autowired
	private MasterServiceIntf masterService;
	
	@RequestMapping("/")
	public String getHome() {
		return "public/index";
	}
	
	@RequestMapping("/register")
	public String getRegister(Model model) {
		Student newStudent = new Student();
		newStudent.setGender('F');
		
		model.addAttribute("student", newStudent);
		model.addAttribute("countries", masterService.getCountries());

		return "public/register";
	}
}
