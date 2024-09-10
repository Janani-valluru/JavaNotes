import java.util.Scanner;

class Employee1{
	int empid;
	String name;
	int basicSalary;
	
	public Employee1(int empid, String name, int basicSalary) {
		
		this.empid = empid;
		this.name = name;
		this.basicSalary = basicSalary;
	}
	
	void displayDetails() {
		System.out.println("EMPID: "+ empid);
		System.out.println("NAME: "+ name);
		System.out.println("basicSalary: "+ basicSalary);
	}
	
}

class FullTimeEmployee extends Employee1{

	private int annualBonus;
	public FullTimeEmployee(int empid, String name) {
		super(empid, name, 30000);
		this.annualBonus = 10000;
		
	}
	float getTotalCompensation() {
		return annualBonus+basicSalary;
	}
	void displayDetails() {
		System.out.println("the fulltime employee salary:"+ getTotalCompensation());
		
	}
}

class PartTimeEmployee extends Employee1{
	int hoursWorked;
	int hourRate;
	public PartTimeEmployee(int empid, String name, int hoursWorked) {
		super(empid, name,0 );
		this.hoursWorked = hoursWorked;
		this.hourRate = 500;
	}
	float getTotalCompensation() {
		return hoursWorked*hourRate;
	}
	
	void displayDetails() {
		System.out.println("hours worked= " +getTotalCompensation() );
	}
	
	
}


public class employeeInheritance{
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("enter the details:");
		System.out.println("1. full time 2 . part time");
		System.out.println("enter choice 1 or 2");
		int ch = s.nextInt();
		
		switch(ch) {
		
		case 1: 
				System.out.println("Full time employee details:::");
				System.out.println("enter id");
				int fid = s.nextInt();
				System.out.println("enter name");
				String fname = s.next();
				
				FullTimeEmployee fte = new FullTimeEmployee(fid, fname);
				 System.out.println("Full-Time Employee Details:");
				fte.displayDetails();
				break;
		
		case 2: 
				System.out.println("Full time employee details:::");
				System.out.println("enter id");
				int pid = s.nextInt();
				System.out.println("enter name");
				String pname = s.next();
				System.out.println("hours worked:");
				int hoursWorked = s.nextInt();
				
				PartTimeEmployee pte = new PartTimeEmployee(pid, pname,hoursWorked);
				pte.displayDetails();
				break;
		default :
			System.out.println("invalid choice");
			break;
				
		}
		s.close();
		
	}
	
}