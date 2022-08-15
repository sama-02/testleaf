package week4.day2.assignment4;

public class Students {
public void getStudentInfo(int id) {
	System.out.println(id);
}
public void getStudentInfo(int id,String name) {
	System.out.println(id+" "+name);
}
public void  getStudentInfo(String email) {
System.out.println(email);	
}
public void  getStudentInfo(long Phonenumber) {
	System.out.println(Phonenumber);
	System.out.println(Phonenumber);
}

	public static void main(String[] args) {
		Students stu=new Students();
		stu.getStudentInfo(101);
		stu.getStudentInfo(101,"Arun");
		stu.getStudentInfo("arun@gmail.com");
		stu.getStudentInfo("2354889855");
	}

}
