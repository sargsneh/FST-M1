package Activities;

public class Activity1 {

	public static void main(String[] args) {
		Car Hyundai = new Car();
		Hyundai.make = 2018;
		Hyundai.colour = "Silver grey";
		Hyundai.transmission = "Manual";
		
		Hyundai.displayCharacteristics();
		Hyundai.brake();
		Hyundai.accelerate();
		

	}

}
