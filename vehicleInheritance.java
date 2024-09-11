import java.util.Scanner;
class Vehicle{
	String make;
	
	String model;
	
	public Vehicle(String make, String model) {
		
		this.make = make;
		this.model = model;
	}
	void displayDetails() {
		System.out.println("the make is :"+ make);
		System.out.println("the model is :"+model);
	}
}

class Car1 extends Vehicle
{
int noOfdoors;
	public Car1(String make, String model, int noOfdoors) {
		super(make, model);
		this.noOfdoors=noOfdoors;
		
}
	
	void doors() {
		if(noOfdoors >=4 && noOfdoors<=6) {
			System.out.println("Cars are available");
		}
		else {
			System.out.println("Cars are not available");
		}
	}
	

	public void displayDetails() {
		// TODO Auto-generated method stub
	
		super.displayDetails();
		System.out.println("Number of doors: " + noOfdoors);
	}
	
}
class Truck extends Vehicle
{
int cargocapacity;;
	public Truck(String make, String model, int cargocapacity) {
		super(make, model);
		this.cargocapacity=cargocapacity;
		
}
	
	void capacity() {
		if(cargocapacity >= 10000) {
			System.out.println("trucks are available");
		}
		else {
			System.out.println("trucks are not available");
		}
	}
	@Override
	void displayDetails() {
		super.displayDetails();
		System.out.println("Cargo capacity: " + cargocapacity + " tons");
	}
}
public class vehicleInheritance {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("THE CARS AND TRUCK SHOP");
		System.out.println("1. CARS 2.TRUCK ");
		System.out.println("enter choice 1 or 2");
		int ch = s.nextInt();
		
		switch(ch) {
		
		case 1: 
		
				System.out.println("cars brand");
				String c = s.next();
				System.out.println("cars model");
				String m = s.next();
				System.out.println("doors");
				int d = s.nextInt();
				
				Car1 ca = new Car1( c ,m, d);
				ca.displayDetails();
				ca.doors();
				break;
	case 2:
			System.out.println("truck brand");
			String t = s.next();
			System.out.println("truck model");
			String mo = s.next();
			System.out.println("tons");
			int tons = s.nextInt();
			
			Truck t1 = new Truck( t ,mo, tons);
			t1.displayDetails();
			t1.capacity();
			break;
			
	default :
		System.out.println("invalid");
		s.close();
			
		

	}

	}
}