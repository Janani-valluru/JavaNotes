 class Car{
	 String model;
	 String make;
	 Engine en;
	 Car(String model, String make, Engine en) {
		super();
		this.model = model;
		this.make = make;
		this.en=en;
	}
	void displayEmp() {
		System.out.println("model:"+ model);
		System.out.println("make:"+ make);
		en.displayEN();
	}


 }
 
 class Engine{
	 int engineNO;
	 String type;
	 int power;
	 
	  Engine(int engineNO, String type, int power) {
			super();
			this.engineNO = engineNO;
			this.type = type;
			this.power = power;
		}
	 void displayEN() {
		 System.out.println("engineNO:"+engineNO);
		 System.out.println("type:"+type);
		 System.out.println("power:"+power);
	 }
 }
 
 public class carRelation {

	public static void main(String[] args) {
		Engine en = new Engine(123,"petrol",500);
		Car c = new Car("audi 818","audi",en);
		c.displayEmp();
	}

}
