package week2.day1;

public class calculator {
	public void add(int a,int b){
		System.out.println(a+b);
		}
	public void sub(int a,int b){
		System.out.println(a-b);
		}
	public void product(int a,int b){
		System.out.println(a*b);
		}
	public void div(int a,int b){
		System.out.println(a/b);
		}
	public static void main(String[] args) {
		calculator calc= new calculator(); {
			calc.add(100, 50);
			calc.sub(100,50);
			calc.product(50,2);
			calc.div(100,50);
			
		}
			
		}

	}

