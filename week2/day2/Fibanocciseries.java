package week2.day2;

public class Fibanocciseries {
	
	public static void main(String[] args) {
		int a=0,b=1;
		
		System.out.print(a+" "+b);
		int c;	
		for (int i = 1; i <=10; i++) {
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}

	}

}
