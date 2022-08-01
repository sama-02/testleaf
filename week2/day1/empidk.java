package week2.day1;

public class empidk {
	public void Empname(String name) {
		System.out.println(name);
	}
	public void Empid(int id) {
		System.out.println(id);
	}
	public void Empadd(String address) {
		System.out.println(address);
	}
	public void Empsalary(double salary) {
		System.out.println(salary);
	}
	public void Empphonenumber(long phonenumber) {
		System.out.println(phonenumber);
	}

	public static void main(String[] args) {
		empidk emp=new empidk();
		emp.Empname("Arun");
		emp.Empid(01);
		emp.Empadd("Chennai");
		emp.Empsalary(20000);
		emp.Empphonenumber(12323555);
		emp.Empname("Ajay");
		emp.Empid(02);
		emp.Empadd("Chennai");
		emp.Empsalary(20000);
		emp.Empphonenumber(12324555);
		emp.Empname("Arul");
		emp.Empid(03);
		emp.Empadd("Chennai");
		emp.Empsalary(20000);
		emp.Empphonenumber(12323575);
		
		

	}

}
