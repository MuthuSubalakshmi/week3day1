package org.student;

import org.department.Department;

public class Student extends Department
{
	public void studentName()
	{
	System.out.println("Suba");
	
	}
	public void studentDept()
	{
		System.out.println("IT");
	}
	
	public void studentId()
	{
		System.out.println("20");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Student obj1=new Student();
obj1.collegeCode();
obj1.collegeName();
obj1.collegeRank();
obj1.deptName();
obj1.studentName();
obj1.studentDept();
obj1.studentId();
	}

}
