package com.sms.service;

import java.util.List;

import com.sms.model.Student;

public class Student_service {
	public interface students{
		public boolean addStudent();
		public List<Student> findAll();
		public int findById(int id);
	}
}
