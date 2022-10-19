package org.student;

import org.department.Department;

public class Student extends Department {
	
	public void studentName() {
		System.out.println("Name: Yatheesh");
	}
	public void studentDept() {
		System.out.println("Department: CSE");
	}
	public void studentId() {
		System.out.println("Student Id: CS2011");
	}
	

	public static void main(String[] args) {
		Student s = new Student();
		s.collegeCode();
		s.collegeName();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentId();
		s.studentDept();

	}

}
