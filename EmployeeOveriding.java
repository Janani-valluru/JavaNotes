
public class EmployeeOveriding {
	
	float basesal=10000;
	
	void findbase() {
		System.out.println("The base salary:"+basesal);
	}

	
}
	class FullTimeEmployee extends EmployeeOveriding{
	
		public void calculateSalary() {
				int bonus =1000;
				System.out.println("FullTimeEmployee :"+bonus*basesal);
	}
	}
	class PartTimeEmployee extends EmployeeOveriding{
		
		public void calculateSalary() {
			int hourRent=200;
			int hoursWorked =9;
			System.out.println("PartTimeEmployee:"+hoursWorked*hourRent);
}
		
	}

	class Contract extends EmployeeOveriding{
		public void calculateSalary() {
			int noofdays = 2;
			
			System.out.println("Contract:"+ basesal*noofdays);
			
			}
			
	
	public static void main(String[] args) {
		EmployeeOveriding em = new EmployeeOveriding();
		em.findbase();
		PartTimeEmployee pe = new PartTimeEmployee();
		pe.calculateSalary();
		Contract eo = new Contract();
		eo.calculateSalary();
		
		
	}

}
