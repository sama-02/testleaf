package week2.day2;

public class Whileloops {

	public static void main(String[] args) {
		int a=12345;
		int c=0;
		while (a>0) {
		int d=a%10;
		c=c+d;
		a=a/10;
	}System.out.println(c);
	}
}
