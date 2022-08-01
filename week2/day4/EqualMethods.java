package week2.day4;

public class EqualMethods {

	public static void main(String[] args) {
		String text1="testleaf";
		String text2="testleaf";
		boolean equals1=text1.equals(text2);
		System.out.println(equals1);
		String text3= new String("TESTLEAF"); //new address but same string
		String text4= new String("TESTLEAF");
		boolean equals2=text3.equals(text4);
		System.out.println(equals2);

	}

}
