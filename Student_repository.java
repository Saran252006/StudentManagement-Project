package com.sms.repository;

import java.util.ArrayList;
import java.util.List;
import com.sms.model.*;
public class Student_repository {
	
	private List<Student> students=new ArrayList<>();
	
	public boolean addStudent(Student student) {
		students.add(student);
		return true;
	}
	
	public List<Student> findAll() {
		return students;
	}
	public int findById(int id) {
		for(Student students:students) {
			if (((Student) students).getId()==id) {
				return id;
			}
		}
		return 0;
	}
}
