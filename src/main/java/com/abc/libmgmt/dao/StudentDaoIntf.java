package com.abc.libmgmt.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.abc.libmgmt.domain.Student;

public interface StudentDaoIntf extends JpaRepository<Student, Long> {
}
