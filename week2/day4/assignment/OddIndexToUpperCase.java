package week2.day4.assignment;

public class OddIndexToUpperCase {

	public static void main(String[] args) {
		String test = "changeme";
		char[] test1=test.toCharArray();
		for (int i = 0; i < test1.length; i++) {
			if (i%2!=0) {
			String t1=String.valueOf(test1[i]);	
			System.out.print(t1.toUpperCase());
			}else {
				System.out.print(test1[i]);
			}
			
			
		}

	}

}
