package week4.day1;


public class LearnStringMethods {

	public static void main(String[] args) {
		String text="123Testleaf456";//string literal declaration
		//String name1=new String("Testleaf");//string using new keyword
		String lowercase=text.toLowerCase();//converts to lowercase
		System.out.println(lowercase);//prints the statement
		String uppercase=text.toUpperCase();//converts to uppercase
		System.out.println(uppercase);//prints the statement
		String s1="   Hello World   ";//string literal declaration
		String trim=s1.trim();//trims the statement.only front and back
		System.out.println(trim);//prints the statement
		String t1="Test";//string literal declaration
		String t2="Leaf";//string literal declaration
		String t3=t1+t2;//concadinates t1 and t2 using '+' operator
		System.out.println(t3);//prints the statement
		String concat=t1.concat("Chennai");//string literal declaration
		System.out.println(concat);//prints the statement
		String name2="All is well";//string literal declaration
		String replace=name2.replace('l', '@');//replaces the first word with the second word
		System.out.println(replace);//prints the statement
		String name4="123test345leaf";//declares a string literal
		String replaceall=name4.replaceAll("\\D","");//removing the text using replace all keyword
		System.out.println(replaceall);//prints the statement
		String data="Testleaf";//string literal declaration
		String substr=data.substring(4);//collects the substring starting index from 4
		System.out.println(substr);//prints the statement
		CharSequence SubSequence=data.subSequence(3, 7);//collects the substring starting index from 3-7
		System.out.println(SubSequence);//prints the statement
		String data1="testleaf";//string literal declaration
		String data2="TestLeaf";//string literal declaration
		Boolean equalsIgnoreCase=data1.equalsIgnoreCase(data2);//checks if the data1 and data2 are equals but ignore the case
		System.out.println(equalsIgnoreCase);//prints the statement
		Boolean equals=data1.equals(data2);//checks if the data1 and data2 also considers case
		System.out.println(equals);//prints the statement
		String name3="testleaf in chennai";//string literal declaration
		Boolean contains=name3.contains("chennai");//checks if the name3 string contains chennai
		System.out.println(contains);//prints the statement
		String dataLength="test";//string literal declaration
		int indexOf=dataLength.indexOf('s');//finds the index of given string
		System.out.println(indexOf);//prints the statement
		Boolean empty=dataLength.isEmpty();//checks if the string is empty
		System.out.println(empty);//prints the statement
		String word="I like India";//string literal
		String[] split=word.split(" ");//splits the index where there are spaces
		for (int i = 0; i < split.length; i++) //loops
		{
			System.out.print(split[i]);////prints the statement
		}
		
	}

}
