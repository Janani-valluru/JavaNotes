//QUESTION 9 FACTORIAL

import java.util.Scanner;

public class facto {
	private int n;

	public void factorial(int n) {
		// TODO Auto-generated method stub
		int fact = 1;
		
		for(int i =1;i<=n;i++) {
			fact = fact*i;
		}
		System.out.println(fact);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		facto f = new facto();
		Scanner s = new Scanner(System.in);
		
		f.factorial(6);

	}

	

}
