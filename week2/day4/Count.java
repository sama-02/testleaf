package week2.day4;

public class Count 
		{
		public static void main(String[] args) 
		{
		String name="Welcome to chennai";
		int count=0;
		char[] chararray=name.toCharArray();
		for (int i = 0; i < chararray.length; i++) 
		{
		if(chararray[i]=='e') {
		count++;
		}
		}
		System.out.println("there are "+count+" e in the string");
		}
		}