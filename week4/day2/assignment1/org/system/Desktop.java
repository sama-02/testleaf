package week4.day2.assignment1.org.system;

public class Desktop extends Computer {
	public void desktopSize() {
		System.out.println("Desktop size is: 15 inch");
	}
	public static void main(String[] args) {
		Desktop desk=new Desktop();
		desk.desktopSize();
		desk.computerModel();

	}

}
