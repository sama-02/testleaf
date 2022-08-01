package week2.day3;

public class Duplicate {

	public static void main(String[] args) {
		int[] a= new int[]{10,20,40,50,60,10,20,40};
for (int i = 0; i < a.length; i++) {
	for (int j = i+1; j < a.length; j++) {
		if (a[i]==a[j]) {
			System.out.println(a[i]);
		}
		
	}
	
}
	}

}
