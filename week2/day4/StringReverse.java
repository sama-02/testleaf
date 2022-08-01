package week2.day4;

public class StringReverse {

	public static void main(String[] args) {
		String test="TestLeaf";
		char[] charArray=test.toCharArray();   //makes the string to array of characters
		System.out.println(charArray);
		for (int i = charArray.length-1; i>=0; i--) {   //loops the array in reverse
			System.out.print(charArray[i]);
			
		}
	}

}
