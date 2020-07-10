package com.abc.libmgmt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.abc.libmgmt.dao.StudentDaoIntf;
import com.abc.libmgmt.domain.Student;

@Service
public class StudentServiceImpl implements StudentServiceIntf {
	
	@Autowired
	private StudentDaoIntf studentDao;

	@Override
	public Student createNewStudent(Student student) {
		return studentDao.save(student);
	}

	@Override
	public Optional<Student> exists(Student student) {
		return studentDao.findOne(Example.of(student));
	}
}
