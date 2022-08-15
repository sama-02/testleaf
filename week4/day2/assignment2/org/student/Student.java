package week4.day2.assignment2.org.student;

import week4.day2.assignment2.org.college.College;

public class Student extends College {
	public void studentName() {
	System.out.println("This is Student name");
	}
	public void studentDept() {
	System.out.println("This is Student dept");
	}
	public void studentId()   {
	System.out.println("This is Student ID");
	}
	public static void main(String[] args) {
		Student stu=new Student();
		stu.studentName();
		stu.studentDept();
		stu.studentId();
		stu.collegeName();
		stu.collegeCode();
		stu.collegeRank();
		stu.deptName();
	
}
}
