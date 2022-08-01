package week2.day3;

public class Loops {

	public static void main(String[] args) {
		int a=0,b=1;
		System.out.print(a+" "+b);
		for (int i = 1; i <10; i++) {
			
			int c;
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
			
			
		}

	}

}
