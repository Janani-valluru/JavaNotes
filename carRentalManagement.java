
 



//QUESTION 3 STUDENT GRADING SYSYTEM
import java.util.Scanner;

class EmpDetails {

String carModel;
int regno;
int carCost;
int rent;



// Method to read bank account details
void readDetails() {
    Scanner s = new Scanner(System.in);
    System.out.print("Enter carModel: ");
    carModel = s.nextLine();
    System.out.print("Enter regno: ");
    regno = s.nextInt();
    
    System.out.print("Enter rent: ");
    rent = s.nextInt();
    
    System.out.println(" ");
    s.close();
}
void displayRent() {
	if(carCost <=3000) {
		int rent =100; //rent per day =50000
		for(int i =0;i<=31;i++) {
		System.out.println("Rent per day: " + (rent*i));
		}
	}

}




// Method to display bank account details
void display() {
    System.out.println("carModel: " + carModel);
    System.out.println("regno: " + regno);
    System.out.println("rent: " + rent);
    System.out.println("Rent per day: " + rent);
   
   
    
}
}

public class carRentalManagement {
public static void main(String[] args) {
    // Creating a new Bank object
	System.out.println("1.Benz  2. BMW 3.FERRAI 4. AUDI 5.MG");
	  EmpDetails b1 = new EmpDetails();
    b1.readDetails();
    b1.display();
    b1.displayRent();
}
}
