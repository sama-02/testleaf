package week4.day2;

public class AudiCar extends Car {
	public void openroof() {
		System.out.println("Roof can open");
	}
	public static void main(String[] args) {
	AudiCar cars=new AudiCar();
	cars.openroof();
	cars.ApplyBreak();
	cars.ApplyGear();
	cars.ApplyLight();
	}

}
