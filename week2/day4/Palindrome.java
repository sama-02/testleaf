package week2.day4;

public class Palindrome {

	public static void main(String[] args) {
	 String name="Madam";
	 String reverse="";
	 char[] chararray=name.toCharArray();
	 for (int i = chararray.length-1; i >=0; i--) {
		 
		 reverse = reverse+chararray[i];
		 
		}
	 
		if (reverse.equalsIgnoreCase(name)) {
			System.out.println("it is palindrome");
		}
		else {
			System.out.println("not palindrome");
		}
		
	}
	}


