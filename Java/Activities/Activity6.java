package Activities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

class Plane{
	//setting private variables
	private List<String> passengers;
	private int maxPassengers;
	private Date lastTimeTookOf;
	private Date lastTimeLanded;
	
	public Plane(int maxPassengers) {
		this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
	}

	//add onboard()
	public void onboard(String passengar) {
		this.passengers.add(passengar);
		
		
	}
	
	//takeoff() current date and time
	public Date takeOff() {
		return this.lastTimeTookOf = new Date();	
	}
	
	//land() last time landed and clear()
	public void land() {
		this.lastTimeLanded = new Date();
		this.passengers.clear();
	}
	
	//getlastTimeLanded 
	public Date getlastTimeLanded() {
		return lastTimeLanded;			
	}
	
	//get passengar list
	public List<String> getpassengers() {
		return passengers;
	}
}


public class Activity6 {
	
	public static void main(String[] args) throws InterruptedException {
		Plane plane = new Plane(10);
		//passengars name
		plane.onboard("Sneha");
		plane.onboard("Stany");
		plane.onboard("Monika");
		
	//Print takeoff time
		System.out.println("Take off time is :" + plane.takeOff());
		
		//Print passengars names
		System.out.println("Passengars on the plane are :" + plane.getpassengers());
		
		Thread.sleep(5000);
		
		System.out.println("Plane landed at: " + plane.getlastTimeLanded());
		
        System.out.println("People on the plane after landing: " + plane.getpassengers());

	}

}
