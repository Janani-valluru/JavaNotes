//QUESTION 6 TEPERATURE CONVERSION

import java.util.Scanner;

public class temperature {

	public static void temperature(int celsius) {
		double F;
		// TODO Auto-generated constructor stub
		F= celsius*(9.0/5)+32;
		System.out.println(F);
	}

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        System.out.print("Enter celcius: ");
	        int a = sc.nextInt();
	        temperature(a);
	        sc.close();

	}

}
