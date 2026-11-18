package com.sms.model;

public class Student {
	private int StudentID;
	private String StudentName;
	private String Department;
	private String Email;
	private long PhoneNumber;
	Student(int StudentID, String StudentName, String Department, 
			String Email, long PhoneNumber){
		this.StudentID=StudentID;
		this.Department=Department;
		this.Email=Email;
		this.StudentName=StudentName;
		this.PhoneNumber=PhoneNumber;
	}
	public int getId() {
		return StudentID;
	}
	public String getName() {
		return StudentName;
	}
	public String getDepartent() {
		return Department;
	}
	public String getEmail() {
		return Email;
	}
	public long getPhoneNumber() {
		return PhoneNumber;
	}
	public void setId(int StudentID) {
		this.StudentID=StudentID;
	}
	public void setName(String StudentName) {
		this.StudentName=StudentName;
	}
	public void setDepartment(String Department) {
		this.Department=Department;
	}
	public void setEmail(String Email) {
		this.Email=Email;
	}
	public void setNmber(long PhoneNumber) {
		this.PhoneNumber=PhoneNumber;
	}
	public String toString() {
		return StudentID+" "+StudentName+" "+Department+" "+Email+" "+PhoneNumber;
	}
	
}
