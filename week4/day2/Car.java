package week4.day2;

public class Car {
	public void ApplyBreak() {
		System.out.println("Breaks are Applied");
	}
	public void ApplyGear() {
		System.out.println("Gears are Applied");
	}
	public void ApplyLight() {
		System.out.println("Lights are Applied");
	}
	
	public static void main(String[] args) {
		Car car=new Car();
		car.ApplyBreak();
		car.ApplyGear();
		car.ApplyLight();

	}

}
