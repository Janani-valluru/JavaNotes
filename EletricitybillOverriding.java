//Assignment 2 (polymorphism) 
//Overriding 3

class ElectricityBill{
	void calculateBill() {
		int unitsPermeter =180;
		int fee =100;
		int bill = fee*unitsPermeter;
		System.out.println("the basic bill :"+ bill);
		}
		
	}

class ResidentialCustomer extends ElectricityBill{
	void calculateBill() {
		int unitsPermeter =180;
		int fee =200;
		int bill = fee*unitsPermeter;
		System.out.println("the ResidentialCustomer bill :"+ bill);
		}
		
	}

class CommercialCustomer extends ElectricityBill{
	void calculateBill() {
		int unitsPermeter =180;
		int fee =300;
		int bill = fee*unitsPermeter;
		System.out.println("the CommercialCustomer bill :"+ bill);
		}
		
	}

class IndustrialCustomer extends ElectricityBill{
	void calculateBill() {
		int unitsPermeter =180;
		int fee =400;
		int bill = fee*unitsPermeter;
		System.out.println("the IndustrialCustomer bill :"+ bill);
		}
		
	}

public class EletricitybillOverriding {

	public static void main(String[] args) {
		ElectricityBill eb = new ElectricityBill();
		eb.calculateBill();
		
		ResidentialCustomer rc = new ResidentialCustomer();
		rc.calculateBill();
		
		CommercialCustomer cc = new CommercialCustomer();
		cc.calculateBill();
		
		IndustrialCustomer ic = new IndustrialCustomer();
		ic.calculateBill();
	}

}
