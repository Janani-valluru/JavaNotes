
//QUESTION 3 STUDENT GRADING SYSYTEM
import java.util.Scanner;

class EmpDetails {
  
  String name;
  int empid;
  String desig;
  int salary;
  


  // Method to read bank account details
  void readDetails() {
      Scanner s = new Scanner(System.in);
      System.out.print("Enter Name: ");
      name = s.nextLine();
      System.out.print("Enter empid: ");
      empid = s.nextInt();
      System.out.print("Enter desig: ");
      desig = s.next();
      System.out.print("Enter salary: ");
      salary = s.nextInt();
      
      System.out.println(" ");
      s.close();
  }
  void displayHike() {
  	if(salary <=650000) {
  		int Hike =30;
  		System.out.println("Hike: " + (salary + (salary * Hike / 100)));
  	}
  
  }

 
  

  // Method to display bank account details
  void display() {
      System.out.println("NAME: " + name);
      System.out.println("empid no: " + empid);
      System.out.println("desig: " + desig);
      System.out.println("salary: " + salary);
     
     
      
  }
}

public class EmployeeManagement {
  public static void main(String[] args) {
      // Creating a new Bank object
	  EmpDetails b1 = new EmpDetails();
      b1.readDetails();
      b1.display();
      b1.displayHike();
  }
}
