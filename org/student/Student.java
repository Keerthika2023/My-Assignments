package org.student;

import org.department.Department;

public class Student extends Department{
	public void studentName() {
		System.out.println("Keerthika");
	}
	public void studentDept() {
		System.out.println("Financial Accounting");
	}
	public void studentId() {
		System.out.println("3215");
	}
	public static void main(String[] args) {
		Student object=new Student();
		object.collegeName();
		object.collegeCode();
		object.collegeRank();
		object.deptName();
        object.studentName();
		object.studentId();
		object.studentDept();
				
	}}
