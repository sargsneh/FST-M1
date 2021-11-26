package Activities;

public class Car {
	//add the variables mentioned
	String colour;
	public int make;
	String transmission;
	int tyres;
	int doors;
	
	//constructor
	Car(){ tyres = 4;
			doors = 4;
	}
	
	//creating new methods
	//displayCharacteristics() - This displays the values of all the variables
	public void displayCharacteristics() {
		System.out.println("Colour of the car is: " + colour);
		System.out.println("Make of the car is: " + make);
		System.out.println("Transmission of the car is: " + transmission);
		System.out.println("No of tyres in the car is: " + tyres);
		System.out.println("No of doors in the car is: " + doors);
	}
	
	//accelarate() - This prints "Car is moving forward."
	public void accelerate() {
		System.out.println("Car is moving forward");
	}
	
	//brake() - This prints "Car has stopped."
	public void brake() {
		System.out.println("Car has stopped");
	}
	
}
