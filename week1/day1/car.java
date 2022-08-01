package week1.day1;

public class car {
	public void applyBreak() {
		System.out.println("Break is applied");
	
	}
	public void applyGear() {
		System.out.println("Gear is applied");
	}
	public void switchOnAc() {
		System.out.println("AC is Turned ON");
	}
	public void applyAccelerate() {
		System.out.println("Acceleration is applied");
	}

	public static void main(String[] args) {
		car MyCar=new car();
		MyCar.applyBreak();
		MyCar.applyGear();
		MyCar.switchOnAc();
		MyCar.applyAccelerate();

	}

}
