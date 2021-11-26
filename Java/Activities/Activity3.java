package Activities;

public class Activity3 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		//Create a variable named seconds and initialize it to 1000000000
		double seconds = 1000000000;
		
		//Create variables to store the time of all planets
		double EarthSeconds = 31557600;
		double MercuryEarthSec = 0.2408467;
		double VenusEarthSec = 0.61519726;
		double MarsEarthSec = 1.8808158;
		double JupiterEarthSec = 11.862615;
		double SaturnEarthSec = 29.447498;
		double UranusEarthSec = 84.016846;
		double NeptuneEarthSec = 164.79132;
		
		//Calculate the age on all the planets and print them
		System.out.println("Age on earth: " + seconds/EarthSeconds);
		System.out.println("Age on Mercury: " + seconds/MercuryEarthSec);
		System.out.println("Age on Venus: " + seconds/VenusEarthSec);
		System.out.println("Age on Mars: " + seconds/MarsEarthSec);
		System.out.println("Age on Jupiter: " + seconds/JupiterEarthSec);
		System.out.println("Age on Saturn: " + seconds/SaturnEarthSec);
		System.out.println("Age on Uranus: " + seconds/UranusEarthSec);
		System.out.println("Age on Neptune: " + seconds/NeptuneEarthSec);

	}

}
