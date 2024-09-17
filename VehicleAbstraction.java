abstract class Vehicle{
	int licensePlate;
	int rentalPricePerDay=300;
	public Vehicle(int licensePlate, int rentalPricePerDay) {
		super();
		this.licensePlate = licensePlate;
		this.rentalPricePerDay = rentalPricePerDay;
	}
	
	public abstract void calculateRentalCost(int days);
}

 class Car extends Vehicle{
	int noOfdoors;
	boolean isautomatic;
	public Car(int licensePlate, int rentalPricePerDay, int noOfdoors, boolean isautomatic) {
		super(licensePlate, rentalPricePerDay);
		this.noOfdoors = noOfdoors;
		this.isautomatic = isautomatic;
	}
	
	void displaycar() {
		System.out.println("CAR  details");
		System.out.println("licensePlate: " + licensePlate);
		System.out.println("rentalPricePerDay: " + rentalPricePerDay);
		System.out.println("noOfdoors: " + noOfdoors);
		System.out.println("isautomatic: " + isautomatic);
		
	}
	@Override
	public void calculateRentalCost(int days) {
		int total = days*200;
		System.out.println("days:"+days);
		System.out.println("car rent total:  " +total);
		
	}
	
}

class Motorcycle extends Vehicle{
	
	int engineDisplacement;
	
	boolean hasSidecar;
	public Motorcycle(int licensePlate, int rentalPricePerDay, int engineDisplacement, boolean hasSidecar) {
		super(licensePlate, rentalPricePerDay);
		this.engineDisplacement = engineDisplacement;
		this.hasSidecar = hasSidecar;
	}
	
	
	
	void displaymotor() {
		System.out.println("Motorcycle details");
		System.out.println("licensePlate: " + licensePlate);
		System.out.println("rentalPricePerDay: " + rentalPricePerDay);
		
		System.out.println("engineDisplacement: " + engineDisplacement);
		System.out.println("hasSidecar: " + hasSidecar);
	}
	@Override
	public void calculateRentalCost(int days) {
		int total = days*400;
		System.out.println("days:"+days);
		System.out.println("motorcycle rent total:  " +total);
		
	}
}




public class VehicleAbstraction {

	public static void main(String[] args) {
		Car c = new Car(1245, 200, 4, true);
		c.displaycar();
		c.calculateRentalCost(4);
		System.out.println("");
	
		
		Motorcycle m =  new Motorcycle(1235, 400 , 3457,false);
		m.displaymotor();
		m.calculateRentalCost(4);
		
	}

}



