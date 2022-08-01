package assignment2;

public class Variables {
	public int add(int a,int b) {
	int c=a+b;
    return c;
	}
	public int sub(int add,int b) {
		
		int c=add-b;
		return c;
		}
	public static void main(String[] args) {
		Variables var = new Variables();
		
		int add=var.add(50,50);
		System.out.println(add);
		int sub=var.sub(add,20);
		System.out.println(sub);

	}
	
}
