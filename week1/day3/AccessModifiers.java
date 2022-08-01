package week1.day3;

public class AccessModifiers {

	public void pub(){
		System.out.println("this public access modifier");
	}
	private void priv() {
		System.out.println("this is private access modifier");
	}
	protected void protd() {
		System.out.println("this is protected access modifier");
	}
	void deaflt() {
		System.out.println("this is default access modifier");
	}
	
	public static void main(String[] args) {
		AccessModifiers mod =new AccessModifiers();
		mod.pub();
		mod.priv();
		mod.protd();
		mod.deaflt();
		
		

	}

}
