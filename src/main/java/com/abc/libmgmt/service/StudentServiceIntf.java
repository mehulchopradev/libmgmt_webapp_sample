package com.abc.libmgmt.service;

import java.util.Optional;

import com.abc.libmgmt.domain.Student;

public interface StudentServiceIntf {
	Student createNewStudent(Student student);
	
	Optional<Student> exists(Student example);
}
