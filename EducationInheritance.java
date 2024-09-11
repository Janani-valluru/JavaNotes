import java.util.Scanner;

class Institute{
	String name;
	
	String location;
	
	public Institute(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}
	
	void displayDetails() {
		System.out.println("name : "+name);
		System.out.println("location : "+location);
	}
}

class School extends Institute{
int noOfstudents;
	public School(String name, String location, int noOfstudents) {
		super(name, location);
		this.noOfstudents=noOfstudents;
	}
	
	School[] createArray() {
		Scanner sc= new Scanner(System.in);
		for(int i =0; i<ca.length;i++) {
			ca[i]= new School(int studentname)
		}
		
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println(noOfstudents);
	}
	
	
}

class College extends Institute{
int noOffaculties;
	public College(String name, String location, int noOffaculties) {
		super(name, location);
		this.noOffaculties=noOffaculties;
	}
	
	void faculty() {
		noOffaculties = 90;
	}
	
	void displayDetails() {
		super.displayDetails();
		System.out.println(noOffaculties);
	}
	
	
}

public class educationInheritance {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Details");
		System.out.println("1.school  2.college ");
		System.out.println("enter choice 1 or 2");
		int ch = s.nextInt();
		
		switch(ch) {
		
		case 1: 
		
				System.out.println("name");
				String cname = s.next();
				System.out.println("location");
				String loc = s.next();
				System.out.println("noOfstudents");
				int d = s.nextInt();
				
				School ca = new School( cname ,loc, d);
				School ca = 
				
				ca.displayDetails();
				ca.students();
				break;
	case 2:
			System.out.println("truck brand");
			String t = s.next();
			System.out.println("truck model");
			String mo = s.next();
			System.out.println("tons");
			int tons = s.nextInt();
			
			College t1 = new College( t ,mo, tons);
			t1.displayDetails();
			t1.faculty();
			break;
			
	default :
		System.out.println("invalid");
		s.close();

	}

	}
}
