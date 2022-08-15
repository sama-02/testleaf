package week4.day2.assignment2.org.college;

import week4.day2.assignment2.org.department.Department;

public class College extends Department{
	public void collegeName() {
	System.out.println("College name is : The New College");
	}
	public void collegeCode() {
	System.out.println("The College code is : 0125");
	}
	public void collegeRank() {
		System.out.println("The College rank is: 012");
	}


	public static void main(String[] args) {
		College coll=new College();
		coll.collegeCode();
		coll.collegeName();
		coll.collegeRank();

	}

}
